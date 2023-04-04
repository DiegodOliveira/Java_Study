public class Conta {
    private String titular;
    private double saldo;

    public Conta(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
    }


    public void depositar(double valor){
        this.saldo += valor;
        System.out.println("Deposito de R$" + valor+" realizado. Saldo atual de R$" + saldo);
    }

    public void sacar(double valor){
        if(this.saldo < valor){
            System.out.println("Saldo insuficiente, peça um empréstimo!");
        }else{
            this.saldo -= valor;
        }
    }

    public void setTitular(){
        this.titular = titular;
    }

    public String getTitular(){
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }
}
