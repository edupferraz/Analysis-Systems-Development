import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // ArrayList<String> queue = new ArrayList<String>();

        Queue<String> q = new ArrayDeque<>();


        Scanner scanner = new Scanner(System.in);

        Boolean isActiveMenu = true;

        while(isActiveMenu) {
            System.out.print("> ");

            String command = scanner.nextLine();

            switch(command){
                case "?": 
                    if(!q.isEmpty()) {
                        System.out.println("Próximo cliente: " + q.peek());
                        q.poll();
                    }
                    break;

                case "sair":
                    isActiveMenu = false;
                    break;
                default: 
                    if(!command.isEmpty()) {
                        q.add(command);
                        System.out.println(command);
                        System.out.println("Há " + q.size() + " cliente na sua frente");
                        break;
                    }

            }
        }
    }
}