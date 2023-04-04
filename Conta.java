package br.com.fiap.banco;
public class Conta {
    //Atributos de classe
    int numero;
    int agencia;
    double saldo;

    //Construtores da classe Conta
    public Conta(){

    }

    public Conta(int numero, int agencia, double saldo){
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    /**
     * Acrescentar valor ao saldo
     * @param valor a ser depositado
    */

    public void depositar (double valor){
         this.saldo += valor;
    }

    public void retirar(double valor){
        this.saldo -= valor;
    }

    public double verificarSaldo(){
        return saldo;
    }
}
