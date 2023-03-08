public class ContaLogin {

    private String nome;
    private int anoNascimento;
    private String email;
    private String senha;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome, int x){
        if(x == 10){
            this.nome = nome;
        }else{
            System.out.println("Código de alteração errado!");
        }

    }

    public int getAnoNascimento(){
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento){
        this.anoNascimento = anoNascimento;
    }

    public String getEmail(String email) {
        return email;
    }

    public void setEmail(){
        this.email = email;
    }

    public String getSenha(String senha){
        return senha;
    }

    public void setSenha(){
        this.senha = senha;
    }
}
