package CursoNelioAlves.curingaDelimitados;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Integer> myInts = Arrays.asList(1,2,3,4);
        List<Double> myDoubles = Arrays.asList(3.14, 5.00, 2.34);
        List<Object> myObjs = new ArrayList<>();

        copy(myInts, myObjs);
        printList(myObjs);
        copy(myDoubles, myObjs);
        printList(myObjs);

    }

    public static void copy(List<? extends  Number> origem, List<? super Number> destino){
        for (Number number : origem){
            destino.add(number);
        }
    }

    public static void printList(List<?> list){
        for (Object obj : list){
            System.out.print(obj + " ");
        }
        System.out.println(" ");
    }
}
