package org.example;

public class TipoContaBasica implements TipoConta {

    private TipoContaBasica() {};

    private static class Holder {
        private static final TipoContaBasica INSTANCIA = new TipoContaBasica();
    }

    public static TipoContaBasica getInstancia() {
        return Holder.INSTANCIA;
    }
}
