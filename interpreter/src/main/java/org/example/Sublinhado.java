package org.example;

public class Sublinhado implements InterpretadorExpressao {
    private InterpretadorExpressao expressao;

    public Sublinhado(InterpretadorExpressao expressao) {
        this.expressao = expressao;
    }

    @Override
    public String interpretar() {
        return "<u>" + expressao.interpretar() + "</u>";
    }
}