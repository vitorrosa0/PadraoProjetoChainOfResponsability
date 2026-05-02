package org.example;

import java.util.ArrayList;

public abstract class Funcionario {

    private ArrayList listaContas = new ArrayList();
    private Funcionario funcionarioSuperior;

    public ArrayList getListaContas() {
        return listaContas;
    }

    public Funcionario getFuncionarioSuperior() {
        return funcionarioSuperior;
    }

    public void setFuncionarioSuperior(Funcionario funcionarioSuperior) {
        this.funcionarioSuperior = funcionarioSuperior;
    }

    public abstract String getDescricaoCargo();

    public String criarConta(Conta conta) {
        if (listaContas.contains(conta.getTipoConta())) {
            return getDescricaoCargo();
        }

        if (funcionarioSuperior != null) {
            return funcionarioSuperior.criarConta(conta);
        }

        return "Conta não criada";
    }
}
