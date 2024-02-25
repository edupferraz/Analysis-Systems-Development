import java.util.Scanner;

public class ExerciseTwo {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Nota do projeto prático 1: ");
        Double projeto1 = Double.parseDouble(teclado.nextLine());

        System.out.print("Nota do projeto prático 2: ");
        Double projeto2 = Double.parseDouble(teclado.nextLine());

        System.out.print("Nota de partipação:  ");
        Double partipacao = Double.parseDouble(teclado.nextLine());

        Double nota = ((((projeto1 * 2) + (projeto2 * 3)) / 5) * 0.9) + (partipacao * 0.1);

        System.out.println("Sua nota é " + nota); 

        if (nota >=  6) {
           System.out.println("Situação: APROVADO");
        } else {
            System.out.println("Situação: REPROVADO");
        }
    }
}
