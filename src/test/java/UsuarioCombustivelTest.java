import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioCombustivelTest {

    @Test
    void deveDefinirNome() {
        UsuarioCombustivel joao = new UsuarioCombustivel("C");
        joao.setNome("Joao");
        assertEquals("Joao", joao.getNome());
    }

    @Test
    void deveDefinirLitrosCombustivelConsumidosValido() {
        UsuarioCombustivel joao = new UsuarioCombustivel("Joao");
        joao.setLitrosCombustivelConsumidos(0);
        assertEquals(0, joao.getLitrosCombustivelConsumidos());
    }

    @Test
    void naoDeveDefinirLitrosCombustivelConsumidosInvalido() {
        try {
            UsuarioCombustivel joao = new UsuarioCombustivel("Joao");
            joao.setLitrosCombustivelConsumidos(-0.01f);
            assertEquals(0, joao.getLitrosCombustivelConsumidos());
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Tentativa de definir quantidade negativa de litros de combustivel", e.getMessage());
        }
    }

    @Test
    void deveDefinirQtdQuilometrosRodadosValida() {
        UsuarioCombustivel joao = new UsuarioCombustivel("Joao");
        joao.setQtdQuilometrosRodados(0);
        assertEquals(0, joao.getQtdQuilometrosRodados());
    }

    @Test
    void naoDeveDefinirQtdQuilometrosRodadosInvalido() {
        try {
            UsuarioCombustivel joao = new UsuarioCombustivel("joao");
            joao.setQtdQuilometrosRodados(-0.01f);
            assertEquals(-0.01f, joao.getQtdQuilometrosRodados());
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Tentativa de definir quantidade negativa de quilometros rodados", e.getMessage());
        }
    }

    @Test
    void deveCalculaMediaCombustivelGasto() {
        UsuarioCombustivel joao = new UsuarioCombustivel("joao");
        joao.setQtdQuilometrosRodados(100);
        joao.setLitrosCombustivelConsumidos(100);
        assertEquals(1, joao.calculaMediaCombustivelGasto());
    }
}