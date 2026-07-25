package Java10x.ExercicioJava10X.Desafio4;

import Java10x.ExercicioJava10X.Desafio4.entities.NinjaAvancado;

public class Program {
    public static void main(String[] args) {
        String nome = "itachi uchiha";
        int idade = 29;
        String habilidade = "sharingar";
        String habilidadeEspecial = "susano perfeito";

        NinjaAvancado itachi = new NinjaAvancado(nome,idade,habilidade,habilidadeEspecial);

        itachi.mostrarInformacoes();
        itachi.executarHabilidade();
        itachi.especialidade();
    }
}
