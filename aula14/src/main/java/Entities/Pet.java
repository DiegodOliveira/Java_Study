package Entities;

public class Pet {

    private String nome;
    private int anoNacimento;
    private double peso;

    public Pet(){}

    public Pet(String nome, int anoNascimento, double peso){
        this.nome = nome;
        this.anoNacimento = anoNascimento;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNacimento() {
        return anoNacimento;
    }

    public void setAnoNacimento(int anoNacimento) {
        this.anoNacimento = anoNacimento;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
