import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    @Test
    void deveAtribuirSexoValido() {
        Pessoa joao = new Pessoa("Feminino", 60, 1.75f);
        joao.setSexo("Masculino");
        assertEquals("Masculino", joao.getSexo());
    }

    @Test
    void naoDeveAtribuirSexoInvalido() {
        try {
            Pessoa joao = new Pessoa("Masculino", 60, 1.75f);
            joao.setSexo("joao");
            assertEquals("cleiton", joao.getSexo());
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Tentativa de atribuirk sexo invalido", e.getMessage());
        }
    }

    @Test
    void deveAtribuirPesoValida() {
        Pessoa joao = new Pessoa("Masculino", 0, 1.75f);
        joao.setPeso(60);
        assertEquals(60, joao.getPeso());
    }

    @Test
    void naoDeveAtribuirPesoInvalida() {
        try {
            Pessoa joao = new Pessoa("Masculino", 0, 1.75f);
            joao.setPeso(-0.01f);
            assertEquals(-0.01f, joao.getPeso());
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Tentativa de atribuir peso invalido", e.getMessage());
        }
    }

    @Test
    void deveAtribuirAlturaValida() {
        Pessoa joao = new Pessoa("Masculino", 60, 0);
        joao.setAltura(1.75f);
        assertEquals(1.75f, joao.getAltura());
    }

    @Test
    void naoDeveAtribuirAlturaInvalida() {
        try {
            Pessoa joao = new Pessoa("Masculino", 60, 1.75f);
            joao.setAltura(-0.01f);
            assertEquals(-0.01f, joao.getAltura());
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Tentativa de atribuir altura invalida", e.getMessage());
        }
    }


    @Test
    void deveCalcularIMCAbaixoPesoFemininoMaximo() {
        Pessoa fernanda = new Pessoa("Feminino", 19.0f, 1);
        assertEquals("abaixo do peso", fernanda.calcularIMC());
    }

    @Test
    void deveCalcularIMCPesoNormalFemininoMinimo() {
        Pessoa fernanda = new Pessoa("Feminino", 19.1f, 1);
        assertEquals("no peso normal", fernanda.calcularIMC());
    }

    @Test
    void deveCalcularIMCPesoNormalFemininoMaximo() {
        Pessoa fernanda = new Pessoa("Feminino", 25.7f, 1);
        assertEquals("no peso normal", fernanda.calcularIMC());
    }

    @Test
    void deveCalcularIMCMarginalmenteAcimaFemininoMinimo() {
        Pessoa fernanda = new Pessoa("Feminino", 25.8f, 1);
        assertEquals("marginalmente acima do peso", fernanda.calcularIMC());
    }

    @Test
    void deveCalcularIMCMarginalmenteAcimaFemininoMaximo() {
        Pessoa fernanda = new Pessoa("Feminino", 27.2f, 1);
        assertEquals("marginalmente acima do peso", fernanda.calcularIMC());
    }

    @Test
    void deveCalcularIMCAcimaPesoFemininoMinimo() {
        Pessoa fernanda = new Pessoa("Feminino", 27.3f, 1);
        assertEquals("acima do peso ideal", fernanda.calcularIMC());
    }

    @Test
    void deveCalcularIMCAcimaPesoFemininoMaximo() {
        Pessoa fernanda = new Pessoa("Feminino", 32.2f, 1);
        assertEquals("acima do peso ideal", fernanda.calcularIMC());
    }

    @Test
    void deveCalcularIMCObesoFemininoMinimo() {
        Pessoa fernanda = new Pessoa("Feminino", 32.3f, 1);
        assertEquals("obeso", fernanda.calcularIMC());
    }


    @Test
    void deveCalcularIMCAbaixoPesoMasculinoMaximo() {
        Pessoa joao = new Pessoa("Masculino", 20.6f, 1);
        assertEquals("abaixo do peso", joao.calcularIMC());
    }

    @Test
    void deveCalcularIMCPesoNormalMasculinoMinimo() {
        Pessoa joao = new Pessoa("Masculino", 20.7f, 1);
        assertEquals("no peso normal", joao.calcularIMC());
    }

    @Test
    void deveCalcularIMCPesoNormalMasculinoMaximo() {
        Pessoa joao = new Pessoa("Masculino", 26.3f, 1);
        assertEquals("no peso normal", joao.calcularIMC());
    }

    @Test
    void deveCalcularIMCMarginalmenteAcimaMasculinoMinimo() {
        Pessoa joao = new Pessoa("Masculino", 26.4f, 1);
        assertEquals("marginalmente acima do peso", joao.calcularIMC());
    }

    @Test
    void deveCalcularIMCMarginalmenteAcimaMasculinoMaximo() {
        Pessoa joao = new Pessoa("Masculino", 27.7f, 1);
        assertEquals("marginalmente acima do peso", joao.calcularIMC());
    }

    @Test
    void deveCalcularIMCAcimaPesoMasculinoMinimo() {
        Pessoa joao = new Pessoa("Masculino", 27.8f, 1);
        assertEquals("acima do peso ideal", joao.calcularIMC());
    }

    @Test
    void deveCalcularIMCAcimaPesoMasculinoMaximo() {
        Pessoa joao = new Pessoa("Masculino", 31.0f, 1);
        assertEquals("acima do peso ideal", joao.calcularIMC());
    }

    @Test
    void deveCalcularIMCObesoMasculinoMinimo() {
        Pessoa joao = new Pessoa("Masculino", 31.1f, 1);
        assertEquals("obeso", joao.calcularIMC());
    }
}