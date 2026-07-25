package CursoNelioAlves.model.entities;

public abstract class ContaHerança {
    private Integer numero;
    private String Titular;
    protected Double saldo;

    public ContaHerança (){

    }

    public ContaHerança(Integer numero, String titular, Double saldo) {
        this.numero = numero;
        Titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return Titular;
    }

    public void setTitular(String titular) {
        Titular = titular;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void saqueConta(double saque){
        saldo -= saque;
    }

    public void depositoConta(double deposito){
        saldo = deposito;
    }


    public abstract void Saque(double valorSaque);
}
