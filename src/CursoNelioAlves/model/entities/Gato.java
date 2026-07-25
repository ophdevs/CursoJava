package CursoNelioAlves.model.entities;

public class Gato extends Animais{

    @Override
    public void emitirSom(){
        System.out.println("miau");
    }

    public void arranharMoveis(){
        System.out.println("Arranhando...");
    }
}
