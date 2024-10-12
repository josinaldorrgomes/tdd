import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import br.com.tdd.JogoBuzz;

public class JogoBuzzTest {

    private Integer numero;
    JogoBuzz jogo = new JogoBuzz();
    
    @Test // Se o número for divisível por 3, imprima "Fizz"
    void ct01() {
        numero = 18;
        assertTrue(jogo.divisivelPorTres(numero));
    }

    @Test // Se o número for divisível por 5, imprima "Buzz"
    void ct02() {
        numero = 5;
        assertTrue(jogo.divisivelPorCinco(numero));
    }

    @Test // Se o número for divisível por 3 e por 5, imprima "FizzBuzz"
    void ct03() {
        numero = 15;
        assertTrue(jogo.divisivelPorTresEPorCinco(numero));
    }

}
