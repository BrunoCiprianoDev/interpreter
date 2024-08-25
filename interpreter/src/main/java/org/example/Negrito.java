package org.example;

public class Negrito implements InterpretadorExpressao {
    private InterpretadorExpressao expressao;

    public Negrito(InterpretadorExpressao expressao) {
        this.expressao = expressao;
    }

    @Override
    public String interpretar() {
        return "<b>" + expressao.interpretar() + "</b>";
    }
}