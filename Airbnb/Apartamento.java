package Airbnb;
import java.util.ArrayList;

public class Apartamento extends Propriedade{
    private String descricao;
    private int fotos;
    private int comodidades;

    public Apartamento(String endereco, int numQuartos, double preco, String descricao, int avaliacoes, int reservas, int fotos, int comodidades){
        super(endereco, numQuartos, preco, reservas, avaliacoes);
        this.descricao = descricao;
        this.fotos = fotos;
        this.comodidades = comodidades;
    }

    public String getDescricao(){
        return descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public int getFotos(){
        return fotos;
    }

    public void setFotos(int fotos){
        this.fotos = fotos;
    }

    public int getComodidades(){
        return comodidades;
    }

    public void setComodidades(int comodidades){
        this.comodidades = comodidades;
    }

    @Override
    public void mostrarDescricao(){
        System.out.println("Apartamento com " + getNumQuartos() + " quartos, localizado em " + getEndereco() + ". Preço por noite: R$" + getPrecos());
    }
}
