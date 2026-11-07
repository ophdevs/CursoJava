package CursoNelioAlves.Curinga;

import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Integer> myints = Arrays.asList(5,34,12);
        List<String> mysts = Arrays.asList("ruan", "pedro", "matheus");
    }

    public static void printlist(List<?> list){
        for (Object obj : list){
            System.out.println(obj);
        }
    }
}
