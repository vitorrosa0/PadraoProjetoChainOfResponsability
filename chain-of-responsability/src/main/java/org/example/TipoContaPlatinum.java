package org.example;

public class TipoContaPlatinum implements TipoConta {

    private TipoContaPlatinum() {};

    private static class Holder {
        private static final TipoContaPlatinum INSTANCIA = new TipoContaPlatinum();
    }

    public static TipoContaPlatinum getInstancia() {
        return Holder.INSTANCIA;
    }
}
