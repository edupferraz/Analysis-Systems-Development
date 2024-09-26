package PolishCalc;

import java.util.Stack;

public class Calc {
    private Stack<Double> stack = new Stack<>();

    public void addNumber(double number) {
        stack.push(number);
    }

    public void doOperation(String operation) {
        switch (operation) {
            case "+":
                stack.push(stack.pop() + stack.pop());
                break;
            case "-":
                stack.push(stack.pop() - stack.pop());
                break;
            case "*":
                stack.push(stack.pop() * stack.pop());
                break;
            case "/":
                stack.push(stack.pop() / stack.pop());
        }

        // if (operation.matches("[-+/*^]$")) {
        //     
        //
        // }
    }

    public Double calc(String operation) {

    }

    public Double result(){
        return stack.pop();
    }
}
