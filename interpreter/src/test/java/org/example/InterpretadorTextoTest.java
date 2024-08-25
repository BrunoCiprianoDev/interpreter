package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class InterpretadorTextoTest {

    @Test
    public void testNegrito() {
        String texto = "*Olá Mundo*";
        InterpretadorExpressao interpretador = new InterpretadorTexto(texto);
        assertEquals("<b>Olá Mundo</b>", interpretador.interpretar());
    }

    @Test
    public void testItalico() {
        String texto = "_Olá Mundo_";
        InterpretadorExpressao interpretador = new InterpretadorTexto(texto);
        assertEquals("<i>Olá Mundo</i>", interpretador.interpretar());
    }

    @Test
    public void testSublinhado() {
        String texto = "~Olá Mundo~";
        InterpretadorExpressao interpretador = new InterpretadorTexto(texto);
        assertEquals("<u>Olá Mundo</u>", interpretador.interpretar());
    }

    @Test
    public void testMultipleFormattings() {
        String texto = "*Olá* _Mundo_ ~Testando~";
        InterpretadorExpressao interpretador = new InterpretadorTexto(texto);
        assertEquals("<b>Olá</b> <i>Mundo</i> <u>Testando</u>", interpretador.interpretar());
    }

    @Test
    public void testPlainText() {
        String texto = "Texto simples";
        InterpretadorExpressao interpretador = new InterpretadorTexto(texto);
        assertEquals("Texto simples", interpretador.interpretar());
    }

    @Test
    public void testEmptyString() {
        String texto = "";
        InterpretadorExpressao interpretador = new InterpretadorTexto(texto);
        assertEquals("", interpretador.interpretar());
    }
}
