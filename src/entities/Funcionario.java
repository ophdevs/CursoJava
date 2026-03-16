package entities;

public class Funcionario {
    public String nome;
    public double salario;
    public double imposto;

    public double NovoSalario(){
        return this.salario - this.imposto;
    }

    public void AcrecentarSalario (double porcentagem){
        double taxa = porcentagem / 100;
        double newSalario = salario * taxa;
        System.out.printf("seu salario é %.2f ", newSalario + this.NovoSalario());
    }
}
