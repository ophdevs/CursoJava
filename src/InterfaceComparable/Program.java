package InterfaceComparable;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Program {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        String path = "/home/ph/projetosGit/CursoJava/src/InterfaceComparable/in.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String name = br.readLine();;
            while (name != null){
                lista.add(name);
                name = br.readLine();
            }

            Collections.sort(lista);

            for (String e: lista) {
                System.out.println(e);
            }

        }catch (IOException e){
            System.out.println("Erro");
        }
    }
}
