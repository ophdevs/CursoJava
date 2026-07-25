package Java10x.ExercicioJava10X.Desafio4.entities;

import Java10x.ExercicioJava10X.Desafio4.interfaces.Ninja;

public class NinjaBasico implements Ninja {
    String nome;
    int idade;
    String habilidade;

    public NinjaBasico(){

    }
    public NinjaBasico(String nome, int idade, String habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome +
                " Idade: " + idade +
                " Habilidade: " + habilidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Voce esta executando a habilidade " + habilidade);
    }
}
