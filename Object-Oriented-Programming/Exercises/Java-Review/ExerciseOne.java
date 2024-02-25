import java.util.Scanner;

public class ExerciseOne {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Entre com seu nome: ");
        String nome = teclado.nextLine();

        System.out.print("Entre com o ano que nasceu: ");
        Integer anoNascimento = Integer.parseInt(teclado.nextLine());

        System.out.print("Entre com o ano atual: ");
        Integer anoAtual = Integer.parseInt(teclado.nextLine());

        System.out.println(nome + ", possui " + (anoAtual - anoNascimento) + " anos.");
    }
}