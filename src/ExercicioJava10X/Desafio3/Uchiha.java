package ExercicioJava10X.Desafio3;

public class Uchiha extends Ninja{
    public String habilidadeEspecial;

    public Uchiha(String nome, int idade, String missao, String nivelDificuldade, String statusMissao, String habilidadeEspecial) {
        super();
        this.nome = nome;
        this.idade = idade;
        this.missao = missao;
        this.nivelDificuldade = nivelDificuldade;
        this.statusMissao = statusMissao;
        this.habilidadeEspecial = habilidadeEspecial;
    }


    public void mostrarHabilidadeEspecial(){
        System.out.println("Usando a habilidade especial :" + this.habilidadeEspecial);
    }
}
