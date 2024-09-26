package esd;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Pilha {
    public static void main(String[] args) {
        try {
            var arq = new FileInputStream(args[0]);
            Scanner inp = new Scanner(arq);
            Stack stack = new Stack();

            while (inp.hasNextLine()) {
                String linha = inp.nextLine();
                stack.push(linha);
            }

            while(!stack.isEmpty()) {
                System.out.println(stack.pop());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado");
        }


    }
}
