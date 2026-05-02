package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaTest {

    FuncionarioCaixaAtendente caixaAtendente;
    FuncionarioGerente gerente;
    FuncionarioDiretor diretor;

    @BeforeEach
    void setUp() {
        diretor = new FuncionarioDiretor(null);
        gerente = new FuncionarioGerente(diretor);
        caixaAtendente = new FuncionarioCaixaAtendente(gerente);
    }

    @Test
    void deveRetornarCaixaAtendenteParaContaBasica() {
        assertEquals("Caixa Atendente", caixaAtendente.criarConta(new Conta(TipoContaBasica.getInstancia())));
    }

    @Test
    void deveRetornarGerenteParaContaGold() {
        assertEquals("Gerente", gerente.criarConta(new Conta(TipoContaGold.getInstancia())));
    }

    @Test
    void deveRetornarDiretorParaContaPlatinum() {
        assertEquals("Diretor", diretor.criarConta(new Conta(TipoContaPlatinum.getInstancia())));
    }

}