package org.example;

public class Texto implements InterpretadorExpressao {
    private String texto;

    public Texto(String texto) {
        this.texto = texto;
    }

    @Override
    public String interpretar() {
        return texto;
    }
}