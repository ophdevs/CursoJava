package CursoNelioAlves.exercicios;

import CursoNelioAlves.model.entities.Animais;
import CursoNelioAlves.model.entities.Cachorro;
import CursoNelioAlves.model.entities.Gato;

public class Exercicio11Upcasting {
    public static void main(String[] args) {
        Animais gato1 = new Gato();
        Animais cachorro1 = new Cachorro();

        if (cachorro1 instanceof Cachorro){
            Cachorro dog = (Cachorro) cachorro1;
            dog.emitirSom();
        }

        if (gato1 instanceof Gato){
            Gato cat = (Gato)gato1;
            cat.emitirSom();
        }

        Animais[] list = new Animais[3];
    }
}
