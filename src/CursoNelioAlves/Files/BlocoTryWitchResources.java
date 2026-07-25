package CursoNelioAlves.Files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BlocoTryWitchResources {
    static void main(String[] args) {
        String path = "/home/ophdev/projeto git/CursoJava/src/CursoNelioAlves.Files/int.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();

            while (line != null){
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
