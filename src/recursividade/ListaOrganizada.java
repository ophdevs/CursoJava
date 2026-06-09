package recursividade;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ListaOrganizada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> listaCont = new ArrayList<>();

        System.out.println("quantos numeros deseja inserir: ");
        int opcao = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < opcao; i++){
            int numero;
            System.out.printf("digite a opcao %d : ", i + 1);
            numero = sc.nextInt();
            listaCont.add(numero);
        }

        System.out.println(MetodoRecursivo(listaCont));
        sc.close();
    }

    public static ArrayList<Integer> MetodoRecursivo(ArrayList<Integer> array){
        if (array.isEmpty() || array.size() == 1){
            return array;
        }
        else {
            int pivo = array.get(array.size() - 1);
            ArrayList<Integer> menores = new ArrayList<>();
            ArrayList<Integer> maiores = new ArrayList<>();

            for (int i = 0; i < array.size() - 1; i++){
                    if (pivo < array.get(i)){
                        maiores.add(array.get(i));

                    }else {
                        menores.add(array.get(i));
                    }
            }

            ArrayList<Integer> resultado = new ArrayList<>();
            resultado.addAll(MetodoRecursivo(menores));
            resultado.add(pivo);
            resultado.addAll(MetodoRecursivo(maiores));

            return resultado;
        }
    }
}
