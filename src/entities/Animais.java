package entities;

public class Animais {
    private String nome;

    public Animais(){

    }

    public Animais(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void emitirSom(){
        System.out.println("...");
    }
}

