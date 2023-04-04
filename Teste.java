package br.com.fiap.banco;

public class Teste {
    public static void main(String[] args){
        Conta cc = new Conta();
        double valor = cc.saldo;
        cc.saldo = 50;
        cc.agencia = 123;
        cc.numero = 321;
        cc.depositar(100);
        cc.verificarSaldo();

        Conta poupanca = new Conta(111, 222, 1000);

        poupanca.retirar(50);

        System.out.println(poupanca.verificarSaldo());
    }
}
