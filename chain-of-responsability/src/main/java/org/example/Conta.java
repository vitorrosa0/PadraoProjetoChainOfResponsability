package org.example;

public class Conta {

    private TipoConta tipoConta;

    public Conta(TipoConta tipoConta) {
        this.tipoConta = tipoConta;
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(TipoConta tipoConta) {
        this.tipoConta = tipoConta;
    }
}
