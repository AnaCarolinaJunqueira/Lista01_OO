import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioEnergiaEletricaTest {

    @Test
    void deveDefinirNome() {
        UsuarioEnergiaEletrica maria = new UsuarioEnergiaEletrica("M");
        maria.setNome("Maria");
        assertEquals("Maria", maria.getNome());
    }

    @Test
    void deveDefinirConsumoQuilowattsValido() {
        UsuarioEnergiaEletrica maria = new UsuarioEnergiaEletrica("Maria");
        maria.setConsumoQuilowatts(0.01f);
        assertEquals(0.01f, maria.getConsumoQuilowatts());
    }

    @Test
    void naoDeveDefinirConsumoQuilowattsNegativo() {
        try {
            UsuarioEnergiaEletrica maria = new UsuarioEnergiaEletrica("Maria");
            maria.setConsumoQuilowatts(-0.01f);
            assertEquals(-0.01f, maria.getConsumoQuilowatts());
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Tentativa de definir consumo de quilowatts negativos", e.getMessage());
        }
    }

    @Test
    void deveCalculaValorPagar() {
        UsuarioEnergiaEletrica maria = new UsuarioEnergiaEletrica("Maria");
        maria.setConsumoQuilowatts(100);
        assertEquals(14.16f, maria.calculaValorAPagar());
    }

}