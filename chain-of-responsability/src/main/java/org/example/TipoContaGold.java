package org.example;

public class TipoContaGold implements TipoConta {

    private TipoContaGold() {};

    private static class Holder {
        private static final TipoContaGold INSTANCIA = new TipoContaGold();
    }

    public static TipoContaGold getInstancia() {
        return Holder.INSTANCIA;
    }
}
