package Airbnb;

import java.util.ArrayList;

public class Hospede extends Usuario{
    private ArrayList<Propriedade> favoritos;

    public Hospede(String nome, String email, String telefone, ArrayList<Propriedade> favoritos){
        super(nome, email, telefone);
        this.favoritos = favoritos;
    }

    public ArrayList<Propriedade> getFavoritos() {
        return favoritos;
    }

    public void setFavoritos(ArrayList<Propriedade> favoritos) {
        this.favoritos = favoritos;
    }

    @Override
    public void mostrarPerfil(){
        System.out.println("Hóspede: " + getNome() +
                "\nEmail: " + getEmail() +
                "\nTelefone: " + getTelefone() +
                "\nFavoritos: " + getFavoritos());
    }
}
