package CursoNelioAlves.Files;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LerArquivos {
    static void main() {
        File file = new File("/home/ophdev/projeto git/CursoJava/src/CursoNelioAlves.Files/int.txt");
        Scanner sc = null;
        try{
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }finally {
            if (sc != null){ //verificar se o sc esta null
                sc.close();
            }
        }
    }
}
