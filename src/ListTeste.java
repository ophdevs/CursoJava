import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class ListTeste {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("maria");
        list.add("alex");
        list.add("ana");
        list.add("pedro");

        list.add(2,"ph");

        for (String x : list){
            System.out.println(x);
        }

        System.out.println("--------------------------");

        System.out.println(list.size());

        list.remove("ana"); // remove pelo nome
        list.remove(0); // remove pela posicao
        list.removeIf(x -> x.charAt(0) == 'a'); // lambda para remover pela primeira letra


        for (String x : list){
            System.out.println(x);
        }

        System.out.println("--------------------------");

        System.out.println("index of pedro: " + list.indexOf("pedro"));
        System.out.println("index of ana: " + list.indexOf("ana"));
        System.out.println("index of roberto: " + list.indexOf("roberto")); // retorna -1 quando nao tem


    }
}
