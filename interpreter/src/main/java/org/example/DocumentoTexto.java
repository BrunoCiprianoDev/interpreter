package org.example;

import java.util.ArrayList;
import java.util.List;

public class DocumentoTexto {
    private String textoOriginal;
    private List<InterpretadorExpressao> formatacoes;

    public DocumentoTexto(String textoOriginal) {
        this.textoOriginal = textoOriginal;
        this.formatacoes = new ArrayList<>();
    }

    public void aplicarNegrito(String texto) {
        formatacoes.add(new Negrito(new Texto(texto)));
    }

    public void aplicarItalico(String texto) {
        formatacoes.add(new Italico(new Texto(texto)));
    }

    public void aplicarSublinhado(String texto) {
        formatacoes.add(new Sublinhado(new Texto(texto)));
    }

    public String obterTextoFormatado() {
        StringBuilder resultado = new StringBuilder(textoOriginal);
        for (InterpretadorExpressao formatacao : formatacoes) {
            resultado.append(" ").append(formatacao.interpretar());
        }
        return resultado.toString();
    }

    public String obterTextoNegrito() {
        StringBuilder resultado = new StringBuilder();
        for (InterpretadorExpressao formatacao : formatacoes) {
            if (formatacao instanceof Negrito) {
                resultado.append(formatacao.interpretar()).append(" ");
            }
        }
        return resultado.toString().trim();
    }

    public String obterTextoItalico() {
        StringBuilder resultado = new StringBuilder();
        for (InterpretadorExpressao formatacao : formatacoes) {
            if (formatacao instanceof Italico) {
                resultado.append(formatacao.interpretar()).append(" ");
            }
        }
        return resultado.toString().trim();
    }

    public String obterTextoSublinhado() {
        StringBuilder resultado = new StringBuilder();
        for (InterpretadorExpressao formatacao : formatacoes) {
            if (formatacao instanceof Sublinhado) {
                resultado.append(formatacao.interpretar()).append(" ");
            }
        }
        return resultado.toString().trim();
    }
}
