package entities;

public class ContaBanco {
    private int numeroConta;
    private String nome;
    private double saldo;

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

    public double Saque (double valorSaque){
        double taxaSaque = 5.00;
        this.saldo = this.saldo - (valorSaque + taxaSaque);
        return saldo;
    }

    public double Deposito (double valorDeposito){
        this.saldo = this.saldo + valorDeposito;
        return saldo;
    }


    public void Mostrarsaldo (){
        System.out.printf("conta: %d, Nome: %s, Saldo %.2f%n", numeroConta, nome, saldo);

    }

}


