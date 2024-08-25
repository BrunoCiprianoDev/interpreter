package org.example;

public class Italico implements InterpretadorExpressao {
    private InterpretadorExpressao expressao;

    public Italico(InterpretadorExpressao expressao) {
        this.expressao = expressao;
    }

    @Override
    public String interpretar() {
        return "<i>" + expressao.interpretar() + "</i>";
    }
}