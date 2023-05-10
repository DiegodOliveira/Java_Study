package Airbnb;

import java.util.ArrayList;

public abstract class Propriedade {
    private String endereco;
    private int numQuartos;
    private double precos;
    private int reservas;
    private int avaliacoes;

    public Propriedade(String endereco, int numQuartos, double precos, int reservas, int avaliacoes){
        this.endereco = endereco;
        this.numQuartos = numQuartos;
        this.precos = precos;
        this.reservas = reservas;
        this.avaliacoes = avaliacoes;
    }

    public String getEndereco(){
        return endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public int getNumQuartos(){
        return numQuartos;
    }

    public void setNumQuartos(int numQuartos){
        this.numQuartos = numQuartos;
    }

    public double getPrecos(){
        return precos;
    }

    public void setPrecos(double Precos){
        this.precos = precos;
    }

    public int getReservas() {
        return reservas;
    }

    public void setReservas(int reservas) {
        this.reservas = reservas;
    }

    public int getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(int avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

    public abstract void mostrarDescricao();
}
