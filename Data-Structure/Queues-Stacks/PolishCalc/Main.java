package PolishCalc;

public class Main {
    public static void main(String[] args) {
        Calc calc = new Calc();

        calc.addNumber(1);
        calc.addNumber(2);
        calc.doOperation("+");
        calc.addNumber(3);
        calc.doOperation("*");

        System.out.printf("Resultado: " + calc.result());
    }
}
