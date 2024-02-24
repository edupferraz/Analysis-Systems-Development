//  HelloWorld.java

 public class HelloWorld {
    public static void main(String[] args) {
        /*
        System.out.println("Hello World");

        System.out.println("Hello" + args[0]); // Ao chamar adiciona o que foi adicionado

        if (args.length > 0) {
            System.out.println("Hello World");
        } else {
            System.out.println("Hello" + args[0]);
        }
        */

        if (args.length < 1) {
            System.out.println("Campo vazio");
            return;
        }

        switch (args[0]) {
            case "pt":
                System.out.println("Olá Mundo");
                break;
            case "en":
                System.out.println("Hello World");
                break;

            case "jp":
                System.out.println("こんにちは世界");
                break;
            
            default:
                System.out.println("Linguagem não reconhecida");;
        }
        
    }
 }