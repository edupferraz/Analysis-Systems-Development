import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Cafeteira {
    public static void main(String[] args) {
        System.out.println("Cafeteira System");


        try(FileWriter arquivo = new FileWriter("usuarios.csv")) {
            List<List<String>> linhas = new ArrayList<>();
            linhas.add(Arrays.asList("123","juca","j@email"));
            for(List<String> elem : linhas){
                arquivo.append(String.join(",",elem));
                arquivo.append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        boolean continua = true;
        int opcao = 0;
        int id = 0;

        Scanner in = new Scanner(System.in);

        while(continua) {
            System.out.println("================");
            System.out.println("Digite 1: Para informações de usuário");
            System.out.println("Digite 2: Para histórico de cafés");
            System.out.println("Digite 3: Para informações da cafeteira");
            System.out.println("Digite 4: Para sair");
            System.out.print("Sua opção: ");
            opcao = in.nextInt();

            if(opcao == 1) {
                System.out.print("Entre com o id do usuário: ");
                id = in.nextInt();
                System.out.println("\tId " + id + " selecionado para informações de usuário");
            }else if(opcao == 2) {
                System.out.print("Entre com o id do usuário: ");
                id = in.nextInt();
                System.out.println("\tId " + id + " selecionado para histórico de cafés");
            }else if(opcao == 3) {
                System.out.println("Informações da cafeteira:");
                System.out.println("\tÓtima cafeteira");
            }else if(opcao == 4) {
                continua = false;
            }
        }
    }

}