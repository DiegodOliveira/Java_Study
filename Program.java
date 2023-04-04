package br.com.fiap.banco;

public class Program {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        if (cc instanceof Conta){
            System.out.println("cc é do tipo Conta");
        }else{
            System.out.println("cc não é do tipo Conta");
        }
    }
}
