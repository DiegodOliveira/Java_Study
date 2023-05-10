package Airbnb;

public class Proprietário extends Usuario{
    private int propriedades;

    public int getPropriedades() {
        return propriedades;
    }

    public void setPropriedades(int propriedades) {
        this.propriedades = propriedades;
    }

    public Proprietário(String nome, String email, String telefone, int propriedades){
        super(nome, email, telefone);
        this.propriedades = propriedades;
    }

    @Override
    public void mostrarPerfil(){
        System.out.println("Nome: " + getNome() +
        "\nEmail: " + getEmail() +
        "\nTelefone: " + getTelefone() +
                "\nPropriedades: " + getPropriedades());
    }
}
