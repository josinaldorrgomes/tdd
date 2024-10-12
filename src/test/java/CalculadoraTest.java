import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import br.com.tdd.Calculadora;
import br.com.tdd.Funcionario;

public class CalculadoraTest {

    Double salarioLiquido;
    Double resultadoEsperado;

    @Test // O funcionário Desenvolvedor terá desconto de 20% caso o salário seja maior ou igual que 3.000,00
    void ct01() {
        Funcionario funcionario = new Funcionario("Jhon", 4.500, "Desenvolvedor");
        salarioLiquido = new Calculadora().calculadoraDeSalario(funcionario);
        resultadoEsperado = 3.600;
        assertTrue(salarioLiquido.equals(resultadoEsperado));
    }

    @Test // O funcionário Desenvolvedor terá desconto de 10% caso o salário seja menor que 3.000,00
    void ct02() {
        Funcionario funcionario = new Funcionario("Jhon", 2.500, "Desenvolvedor");
        salarioLiquido = new Calculadora().calculadoraDeSalario(funcionario);
        resultadoEsperado = 2.250;
        assertTrue(salarioLiquido.equals(resultadoEsperado));
    }

    @Test // O funcionário DBA terá desconto de 25% caso o salário seja maior ou igual que 2.000,00
    void ct03() {
        Funcionario funcionario = new Funcionario("Peter", 5.500, "DBA");
        salarioLiquido = new Calculadora().calculadoraDeSalario(funcionario);
        resultadoEsperado = 4.125;
        assertTrue(salarioLiquido.equals(resultadoEsperado));
    }

    @Test // O funcionário DBA terá desconto de 15% caso o salário seja menor que 2.000,00
    void ct04() {
        Funcionario funcionario = new Funcionario("Peter", 1.800, "DBA");
        salarioLiquido = new Calculadora().calculadoraDeSalario(funcionario);
        resultadoEsperado = 1.530;
        assertTrue(salarioLiquido.equals(resultadoEsperado));
    }

    @Test // O funcionário Testador terá desconto de 25% caso o salário seja maior ou igual que 2.000,00
    void ct05() {
        Funcionario funcionario = new Funcionario("Andrew", 3.500, "Testador");
        salarioLiquido = new Calculadora().calculadoraDeSalario(funcionario);
        resultadoEsperado = 2.625;
        assertTrue(salarioLiquido.equals(resultadoEsperado));
    }

    @Test // O funcionário Testador terá desconto de 15% caso o salário seja menor que 2.000,00
    void ct06() {
        Funcionario funcionario = new Funcionario("Andrew", 1.500, "Testador");
        salarioLiquido = new Calculadora().calculadoraDeSalario(funcionario);
        resultadoEsperado = 1.275;
        assertTrue(salarioLiquido.equals(resultadoEsperado));
    }

    @Test // O funcionário Gerente terá desconto de 30% caso o salário seja maior ou igual que 5.000,00
    void ct07() {
        Funcionario funcionario = new Funcionario("Domonic", 6.500, "Gerente");
        salarioLiquido = new Calculadora().calculadoraDeSalario(funcionario);
        resultadoEsperado = 4.550;
        assertTrue(salarioLiquido.equals(resultadoEsperado));
    }

    @Test // O funcionário Gerente terá desconto de 20% caso o salário seja menor que 5.000,00
    void ct08() {
        Funcionario funcionario = new Funcionario("Dominic", 4.500, "Gerente");
        salarioLiquido = new Calculadora().calculadoraDeSalario(funcionario);
        resultadoEsperado = 3.600;
        assertTrue(salarioLiquido.equals(resultadoEsperado));
    }

}
