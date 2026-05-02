package org.example;

public class FuncionarioCaixaAtendente extends Funcionario {

    public FuncionarioCaixaAtendente(Funcionario superior) {
        getListaContas().add(TipoContaBasica.getInstancia());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Caixa Atendente";
    }
}
