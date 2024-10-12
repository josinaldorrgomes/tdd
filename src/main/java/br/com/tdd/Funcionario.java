package br.com.tdd;

public class Funcionario {
    
    private String nome;
    private Double salarioBase;
    private String cargo;
    private Double salarioLiquido;

    public Funcionario() {
    }

    public Funcionario(String nome, Double salarioBase, String cargo) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalarioLiquido() {
        return salarioLiquido;
    }

    public void setSalarioLiquido(Double salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }

    @Override
    public String toString() {
        return "Funcionario [nome=" + nome + ", salarioBase=" + salarioBase + ", cargo=" + cargo + ", salarioLiquido="
                + salarioLiquido + "]";
    }

}
