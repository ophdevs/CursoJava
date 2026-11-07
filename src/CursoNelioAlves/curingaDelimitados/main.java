package CursoNelioAlves.curingaDelimitados;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<shape> myshapes = new ArrayList<>();
        myshapes.add(new retangulo(3.0, 2.0));
        myshapes.add(new circulo(2.0));

        List<circulo> mycirculos = new ArrayList<>();

        mycirculos.add(new circulo(3.0));
        mycirculos.add(new circulo(2.0));

        System.out.println("area total: " + totalArea(mycirculos));

    }

    public static double totalArea (List<? extends shape> list){
        double soma = 0.0;
        for (shape s : list){
            soma += s.area();
        }
        return soma;
    }
}
