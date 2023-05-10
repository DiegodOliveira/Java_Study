package Airbnb;

import java.util.ArrayList;

public class Hotel extends Propriedade{
    private int numBanheiros;
    private int numCamas;
    private double area;

    public Hotel(String endereco, int numQuartos, double preco, int reservas, int avaliacoes, int numBanheiros, int numCamas, double area){
        super(endereco, numQuartos, preco, reservas, avaliacoes);
        this.numBanheiros = numBanheiros;
        this.numCamas = numCamas;
        this.area = area;
    }

    public int getNumBanheiros() {
        return numBanheiros;
    }

    public void setNumBanheiros(int numBanheiros) {
        this.numBanheiros = numBanheiros;
    }

    public int getNumCamas() {
        return numCamas;
    }

    public void setNumCamas(int numCamas) {
        this.numCamas = numCamas;
    }

    @Override
    public void mostrarDescricao(){
        System.out.println("O quarto de Hotel possui " + getNumQuartos() + ", fica no endereço " + getEndereco() + ", e o seu preço por noite é R$: " + getPrecos() +
        ".\nO quarto terá " + getNumCamas() + " e " + getNumBanheiros() + "banheiros.");
    }
}
