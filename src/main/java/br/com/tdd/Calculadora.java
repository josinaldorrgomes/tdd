package br.com.tdd;

public class Calculadora {

    public Double calculadoraDeSalario(Funcionario funcionario) {
        
        if (funcionario.getCargo().contentEquals("Desenvolvedor")) {
            if (funcionario.getSalarioBase() >= 3.000) {
                funcionario.setSalarioLiquido(funcionario.getSalarioBase() - (funcionario.getSalarioBase() * 0.20));
            } else if (funcionario.getSalarioBase() < 3.000) {
                funcionario.setSalarioLiquido(funcionario.getSalarioBase() - (funcionario.getSalarioBase() * 0.10));
            }
        } else if (funcionario.getCargo().contentEquals("DBA")) {
            if (funcionario.getSalarioBase() >= 2.000) {
                funcionario.setSalarioLiquido(funcionario.getSalarioBase() - (funcionario.getSalarioBase() * 0.25));
            } else if (funcionario.getSalarioBase() < 2.000) {
                funcionario.setSalarioLiquido(funcionario.getSalarioBase() - (funcionario.getSalarioBase() * 0.15));
            }
        } else if (funcionario.getCargo().contentEquals("Testador")) {
            if (funcionario.getSalarioBase() >= 2.000) {
                funcionario.setSalarioLiquido(funcionario.getSalarioBase() - (funcionario.getSalarioBase() * 0.25));
            } else if (funcionario.getSalarioBase() < 2.000) {
                funcionario.setSalarioLiquido(funcionario.getSalarioBase() - (funcionario.getSalarioBase() * 0.15));
            }
        } else if (funcionario.getCargo().contentEquals("Gerente")) {
            if (funcionario.getSalarioBase() >= 5.000) {
                funcionario.setSalarioLiquido(funcionario.getSalarioBase() - (funcionario.getSalarioBase() * 0.30));
            } else if (funcionario.getSalarioBase() < 5.000) {
                funcionario.setSalarioLiquido(funcionario.getSalarioBase() - (funcionario.getSalarioBase() * 0.20));
            }
        }
        return funcionario.getSalarioLiquido();
    }
}
