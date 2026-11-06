package CursoNelioAlves.generics;

import java.util.ArrayList;
import java.util.List;

public class printService<T> {
    private List<T> list = new ArrayList<>();

    public void addValue(T value){
        list.add(value);
    }

    public T firstValue(){
        if (list.isEmpty()){
            System.out.println("list is empty");
        }
            return list.get(0);
    }

    public void print(){
        System.out.print("[");
        if (!list.isEmpty()){
            System.out.print(list.get(0));
        }
        for (int i = 1; i < list.size(); i++) {
            System.out.print("," + list.get(i));
        }
        System.out.println("]");
    }
}
