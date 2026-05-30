package model.entities;

public class Cachorro extends Animais{

    @Override
    public void emitirSom(){
        System.out.println("aU AU");
    }

    public void buscarBola(){
        System.out.println("buscando bola...");
    }
}
