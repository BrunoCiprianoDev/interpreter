package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DocumentoTextoTest {

    private DocumentoTexto documentoTexto;

    @BeforeEach
    public void setUp() {
        documentoTexto = new DocumentoTexto("Texto Base");
    }

    @Test
    public void testAplicarNegrito() {
        documentoTexto.aplicarNegrito("Negrito");
        assertEquals("Texto Base <b>Negrito</b>", documentoTexto.obterTextoFormatado());
    }

    @Test
    public void testAplicarItalico() {
        documentoTexto.aplicarItalico("Italico");
        assertEquals("Texto Base <i>Italico</i>", documentoTexto.obterTextoFormatado());
    }

    @Test
    public void testAplicarSublinhado() {
        documentoTexto.aplicarSublinhado("Sublinhado");
        assertEquals("Texto Base <u>Sublinhado</u>", documentoTexto.obterTextoFormatado());
    }

    @Test
    public void testAplicarMultipleFormatacoes() {
        documentoTexto.aplicarNegrito("Negrito");
        documentoTexto.aplicarItalico("Italico");
        documentoTexto.aplicarSublinhado("Sublinhado");
        assertEquals("Texto Base <b>Negrito</b> <i>Italico</i> <u>Sublinhado</u>", documentoTexto.obterTextoFormatado());
    }

    @Test
    public void testObterTextoNegrito() {
        documentoTexto.aplicarNegrito("Negrito");
        documentoTexto.aplicarItalico("Italico");
        assertEquals("<b>Negrito</b>", documentoTexto.obterTextoNegrito());
    }

    @Test
    public void testObterTextoItalico() {
        documentoTexto.aplicarItalico("Italico");
        documentoTexto.aplicarSublinhado("Sublinhado");
        assertEquals("<i>Italico</i>", documentoTexto.obterTextoItalico());
    }

    @Test
    public void testObterTextoSublinhado() {
        documentoTexto.aplicarSublinhado("Sublinhado");
        documentoTexto.aplicarNegrito("Negrito");
        assertEquals("<u>Sublinhado</u>", documentoTexto.obterTextoSublinhado());
    }

    @Test
    public void testSemFormatacao() {
        assertEquals("Texto Base", documentoTexto.obterTextoFormatado());
    }
}