import java.util.Scanner;

public class Cilindro {
  public static void main (String[] args) {    
    Scanner teclado = new Scanner(System.in);    
    double volumeCilindro, areaCilindro, altura, raio;    
    final double PI = 3.1415; 
    
    System.out.println("Entre com o raio");    
    raio = teclado.nextDouble();    
    
    System.out.println("Entre com a altura");    
    altura = teclado.nextDouble();    volumeCilindro = PI * PI * raio * altura;    
    
    areaCilindro = 2 * PI * raio * (raio + altura);    
    System.out.println ("valor do volume é" + volumeCilindro);    
    System.out.println ("valor da área é" + areaCilindro);
  }
}
