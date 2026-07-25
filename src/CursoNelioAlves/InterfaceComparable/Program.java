package CursoNelioAlves.InterfaceComparable;

import CursoNelioAlves.InterfaceComparable.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Program {
    public static void main(String[] args) {
        ArrayList<Employee> lista = new ArrayList<>();
        String path = "/home/ph/projetosGit/CursoJava/src/CursoNelioAlves.InterfaceComparable/in.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String employeCsv = br.readLine();;
            while (employeCsv != null){
                String[] fields = employeCsv.split(",");
                lista.add(new Employee(fields[0], Double.parseDouble(fields[1])));
                employeCsv  = br.readLine();
            }

            Collections.sort(lista);

            for (Employee emp: lista) {
                System.out.println(emp.getName() + ", " + emp.getSalary());
            }

        }catch (IOException e){
            System.out.println("Erro");
        }
    }
}
