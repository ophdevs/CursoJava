<<<<<<< HEAD:src/Ex/Exercicio11Upcasting.java
package Ex;
=======
package exercicios;
>>>>>>> 90621b692f9f72a07d1a7d753761b0564b5094c1:src/exercicios/Exercicio11Upcasting.java

import entities.Animais;
import entities.Cachorro;
import entities.Gato;

import java.util.ArrayList;

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
