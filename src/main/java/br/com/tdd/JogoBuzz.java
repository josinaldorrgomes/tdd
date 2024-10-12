package br.com.tdd;

public class JogoBuzz {
    
    public Boolean divisivelPorTres(Integer numero) {
        if (numero % 3 == 0) {
            System.out.println("Fizz");
            return true;
        }
        return false;
    }

    public Boolean divisivelPorCinco(Integer numero) {
        if (numero % 5 == 0) {
            System.out.println("Buzz");
            return true;
        }
        return false;
    }
    
    public Boolean divisivelPorTresEPorCinco(Integer numero) {
        if (numero % 5 == 0 && numero % 3 == 0) {
            System.out.println("Buzz");
            return true;
        }
        return false;
    }

}
