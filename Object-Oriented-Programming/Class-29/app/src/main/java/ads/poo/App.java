/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ads.poo;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) {

         /*  Proguard - Ofuscação

        //String currentDir = System.getProperty("user.dir");
        //Path path = Path.of(currentDir + "/arquivo.txt");

        // ./gradlew run --args "teste.txt"

        // Path path = Path.of(args[0]);

       System.out.println(path);

        if (Files.exists(path)) {
            System.out.println(String.format("Arquivo: %s", path.toAbsolutePath()));
            System.out.println(String.format("Regular: %s", Files.isRegularFile(path)));
            System.out.println(String.format("Diretório: %s", Files.isDirectory(path)));
            System.out.println(String.format("Permissão de leitura: %s", Files.isReadable(path)));
            System.out.println(String.format("Permissão de escrita: %s", Files.isWritable(path)));
        } else {
            System.out.println("Arquivo não encontrado");
        }
        String currentDir = System.getProperty("user.dir");
        Path path = Path.of(currentDir + "/novo.txt");
        
        try {
            Files.createFile(path);
            System.out.println("Arquivo criado");

            Path novoPath = Path.of(currentDir + "/novo.txt");
            Files.move(path, novoPath);
            System.out.println("Arquivo atualizado");


            Files.deleteIfExists(novoPath);
            System.out.println("Arquivo deletado");
        } catch (Exception e) {
            System.err.println("Erro: " + e);
        }



        String currentDir = System.getProperty("user.dir");
        Path inicial = Path.of(currentDir);

        try(Stream<Path> paths = Files.walk(inicial)) {
            paths.forEach(arq -> {
                int profundidade = inicial.relativize(arq).getNameCount();
                String sufixo = (Files.isDirectory(arq) ? "" : "." + profundidade);
                System.out.println(" ".repeat(profundidade) + arq.getFileName() + sufixo);
            });
        } catch (Exception e ) {
            System.out.println(e.getMessage());
        }
          */

        System.out.println("---------------------------------------------------------------");
        System.out.println("Comando                       Descrição");
        System.out.println("---------------------------------------------------------------");

        System.out.println("ls                          | Lista Conteúdo do Diretório Atual");
        System.out.println("stat <arquivo>              | Imprime propriedades do arquivo");
        System.out.println("mkfile <arquivo>            | Cria um arquivo texto");
        System.out.println("rm <arquivo>                | Exclui o arquivo indicado");
        System.out.println("mv <arquivo1> <arquivo2>    | Move o arquivo1 para o arquivo2");

        System.out.println("");

        Scanner scanner = new Scanner(System.in);

        String currentDir = System.getProperty("user.dir");

        while (true) {
            System.out.print("> ");

            String line = scanner.nextLine();
            String[] words = line.split(" ");

            String command = words[0];

            switch (command) {
                case "ls":

                    Path dir = Path.of(currentDir);

                    try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
                        for (Path path : stream) {
                            System.out.println(path.getFileName());
                        }
                    } catch (IOException e) {
                        System.err.println("Erro: " + e);
                    }
                    break;
                case "stat":
                    System.out.println("Imprime propriedades");



                    break;
                case "mkfile":
                    Path path = Path.of(currentDir+"/"+words[1]+".txt");

                    try {
                        Files.createFile(path);
                        System.out.println("Arquivo criado");
                    } catch (Exception e) {
                        System.err.println("Erro: " + e);
                    }

                    break;
                case "rm":
                    System.out.println("Exclui o arquivo indicado");
                    Path novoPath = Path.of(currentDir+"/"+words[1]+".txt");

                    try {
                        Files.deleteIfExists(novoPath);
                        System.out.println("Arquivo excluído");
                    } catch (Exception e) {
                        System.err.println("Erro: " + e);
                    }

                    break;
                case "mv":
                    System.out.println("Move o arquivo indicado");
                    Path pathOrigin = Path.of(currentDir+"/"+words[1]+".txt");

                    try {
                        Files.createFile(pathOrigin);
                        System.out.println("Arquivo criado");
                        Path pathDestiny = Path.of(currentDir+"/arquivo−renomeado.txt");
                        Files.move(pathOrigin, pathDestiny);
                        System.out.println("Arquivo movido");
                    } catch (Exception e) {
                        System.err.println("Erro: " + e);
                    }

                    break;
                default:
                    System.out.println("Comando incorreto");
                    break;
            }
        }




    }

}