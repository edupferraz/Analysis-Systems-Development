import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ExerciseThree {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random r = new Random();


        int numeroSorteado = r.nextInt(100)+1;
        System.out.println(numeroSorteado);
        boolean acertou = false;
        List<Number> tentativas = new ArrayList<>();

        while (!acertou) {
            
            System.out.print("Informe um número: ");
            Integer chute = Integer.parseInt(teclado.nextLine());
            
            if (chute == numeroSorteado) {
                acertou = true;
                System.out.println("Você acertou o número sorteado.");
            } else {
                int counter = 0;
                tentativas.add(chute);
      
                for(int i = 0; i < tentativas.size(); i++) {

                    if (tentativas.get(i) == chute) {
                        counter++;
                    }

                }
                                
                if (counter == 1 || counter == 0) {
                    System.out.println("Tente outra vez.");
                } else {
                    System.out.println("Você já escolheu " + counter + " vezes o número " + chute + ", tente outro número. ");
                }




            }
        }
        


    }
}
