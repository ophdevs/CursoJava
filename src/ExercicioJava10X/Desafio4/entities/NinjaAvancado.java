package ExercicioJava10X.Desafio4.entities;

import ExercicioJava10X.Desafio4.interfaces.Ninja;

public class NinjaAvancado extends NinjaBasico implements Ninja {

    String especialidade;

    public NinjaAvancado() {
    }

    public NinjaAvancado(String nome, int idade, String habilidade, String especialidade) {
        super(nome, idade, habilidade);
        this.especialidade = especialidade;
    }

    public void especialidade (){
        System.out.println("Essa é a habilidade especial do ninja " + especialidade);
    }
}
