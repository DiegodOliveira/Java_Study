package br.com.fiap.banco;

public class ContaCorrente extends Conta{
    private String tipo;

    private Double chequeEspecial;
    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public double getChequeEspecial(){
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial){
        this.chequeEspecial = chequeEspecial;
    }

    public Double getSaldoDisponivel(){
        return getSaldoDisponivel() + this.chequeEspecial;
    }

    @Override
    public void retirar(double valor){
        valor = valor + 10;
        super.retirar(valor);
    }
}
