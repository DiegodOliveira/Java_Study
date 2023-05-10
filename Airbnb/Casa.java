package Airbnb;

import java.util.ArrayList;

public class Casa extends Propriedade{
    private double tamanho;
    private int andares;

    public Casa(String endereco, int numQuartos, double preco, int reservas, int avaliacoes, double tamanho, int andares){
        super(endereco, numQuartos, preco, reservas, avaliacoes);
        this.tamanho = tamanho;
        this.andares = andares;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public int getAndares() {
        return andares;
    }

    public void setAndares(int andares) {
        this.andares = andares;
    }

    @Override
    public void mostrarDescricao(){
        System.out.println("A casa tem uma área de " + getTamanho() + "m², com " + getAndares() + " andares."
        + "\nPossui " + getNumQuartos() + " quartos, está no endereço " + getEndereco() + ", e o custo por noite é de: R$" + getPrecos());
    }
}
