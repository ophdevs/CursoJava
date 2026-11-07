package CursoNelioAlves.genericsDelimitados;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class genericosDelimitados {
    public static void main(String[] args) {
        List<produto> list = new ArrayList<>();

        String path = "/home/ph/projetosGit/CursoJava/src/CursoNelioAlves/genericsDelimitados/lista";

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();

            while(line != null){
                String[] fields = line.split(",");
                list.add(new produto(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }
            produto x = CalculationService.max(list);
            System.out.println("maior preço: ");
            System.out.println(x);


        } catch(IOException e){
                System.out.println("Error: " + e.getMessage());
            }
    }
}
