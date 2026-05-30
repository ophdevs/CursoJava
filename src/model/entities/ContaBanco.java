package model.entities;

public class ContaBanco {
    private int numeroConta;
    private String nome;
    protected double saldo;

    public ContaBanco(){
    }

    public ContaBanco(int numeroConta, String nome, double saldo) {
        this.numeroConta = numeroConta;
        this.nome = nome;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo(){ return saldo;}

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSaldo(double valorIni) {
        this.saldo = saldo;
    }

    public void Saque (double valorSaque){  saldo -= valorSaque + 5.0; }

    public double Deposito (double valorDeposito){
        this.saldo = this.saldo + valorDeposito;
        return saldo;
    }


    public void Mostrarsaldo (){
        System.out.printf("conta: %d, Nome: %s, Saldo %.2f%n", numeroConta, nome, saldo);
    }

}


