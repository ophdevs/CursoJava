package CursoNelioAlves.excecoes;

import CursoNelioAlves.model.exceptions.LoginVazioException;
import CursoNelioAlves.model.exceptions.Usuario;

public class Login {
    public static void main(String[] args) {
        Usuario login = new Usuario("123456", "ghro");

        try{
            login.autentificar("", "12345");
            System.out.println("login realizado com sucesso");
        }
        catch (LoginVazioException e){
            System.out.println("erro: " + e.getMessage());
        }

        System.out.println();

    }
}
