package CursoNelioAlves.Files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterBufferedWriter {
    static void main(String[] args) {
        String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};

        String path = "/home/ophdev/projeto git/CursoJava/src/CursoNelioAlves.Files/dados.txt";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
            for (String line : lines){
                bw.write(line);
                bw.newLine();
            }

        }
        catch (IOException e){
            System.out.printf("Error : %s", e.getMessage());
        }
    }
}
