package Files.Exercicio;

import java.io.*;
import java.text.ParseException;
import java.util.ArrayList;

public class Main {
    static void main(String[] args) throws ParseException {
        String path = "/home/ophdev/projeto git/CursoJava/src/Files/Exercicio/Input.csv";
        String pathOut = "/home/ophdev/projeto git/CursoJava/src/Files/Exercicio/Out/Summary.csv";
        ArrayList<Produto> produtos = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();


            while (line != null){
                String[] fields = line.split(",");
                String name = fields[0];
                double value = Double.parseDouble(fields[1]);
                int quantity = Integer.parseInt(fields[2]);
                produtos.add(new Produto(name, value,quantity));
                line = br.readLine();
            }

            try(BufferedWriter bw = new BufferedWriter( new FileWriter(pathOut))){

                for (Produto item : produtos){
                    bw.write(item.getName() + "," + String.format("%.2f", item.Total()));
                    bw.newLine();
                }

            }catch (IOException e){
                System.out.println("Error :" + e.getMessage());
            }

        } catch(IOException e){
            System.out.println("Error :" + e.getMessage());
        }
    }
}
