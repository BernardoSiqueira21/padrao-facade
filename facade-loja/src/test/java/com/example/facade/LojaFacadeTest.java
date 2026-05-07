package com.example.facade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LojaFacadeTest {

    @Test
    void testFinalizarCompra() {

        LojaFacade facade = new LojaFacade();

        String resultado = facade.finalizarCompra();

        assertTrue(resultado.contains("Pagamento aprovado"));
        assertTrue(resultado.contains("Produto separado no estoque"));
        assertTrue(resultado.contains("Entrega enviada"));
    }
}