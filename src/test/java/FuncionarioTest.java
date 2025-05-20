import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void deveDefinirNome() {
        Funcionario maria = new Funcionario("M");
        maria.setNome("Maria");
        assertEquals("Maria", maria.getNome());
    }

    @Test
    void deveDefinirSalarioValido() {
        Funcionario maria = new Funcionario("Maria");
        maria.setSalarioBruto(0.01f);
        assertEquals(0.01f, maria.getSalarioBruto());
    }

    @Test
    void naoDeveDefinirSalarioNaoPositivo() {
        try {
            Funcionario maria = new Funcionario("Maria");
            maria.setSalarioBruto(0);
            assertEquals(0, maria.getSalarioBruto());
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Tentativa de definir um salario bruto com valor nulo ou negativo", e.getMessage());
        }
    }

    @Test
    void deveDefinirAumentoValido() {
        Funcionario maria = new Funcionario("Maria");
        maria.setSalarioBruto(100);
        maria.calculaAumento(0.01f);
        assertEquals(100.01f, maria.getSalarioBruto());
    }

    @Test
    void naoDeveDefinirAumentoNegativo() {
        try {
            Funcionario maria = new Funcionario("Maria");
            maria.setSalarioBruto(100);
            maria.calculaAumento(-0.01f);
            assertEquals(99.99f, maria.getSalarioBruto());
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Tentativa de definir um aumento com valor negativo", e.getMessage());
        }
    }

    @Test
    void deveCalcularSalarioLiquidoValido() {
        Funcionario maria = new Funcionario("Maria");
        maria.setSalarioBruto(100);
        assertEquals(92.01f, maria.calculaSalarioLiquido(0.01f, 1));
    }

    @Test
    void naoDeveCalcularSalarioLiquidoQtdNegativaHorasExtra() {
        try {
            Funcionario maria = new Funcionario("Maria");
            maria.setSalarioBruto(100);
            assertEquals(99.99f, maria.calculaSalarioLiquido(0.01f, -1));
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Tentativa de definir um numero negativo de horas extras", e.getMessage());
        }

    }

    @Test
    void naoDeveCalcularSalarioLiquidoValorNegativoHorasExtra() {
        try {
            Funcionario maria = new Funcionario("Maria");
            maria.setSalarioBruto(100);
            assertEquals(99.99f, maria.calculaSalarioLiquido(-0.01f, 1));
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Tentativa de definir um valor negativo por hora extra", e.getMessage());
        }

    }

}