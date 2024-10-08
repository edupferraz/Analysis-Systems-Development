package org.example;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BinCount {
    public static void main (String[] args) {
        Scanner imp = new Scanner(System.in);
        ArrayDeque<String> q = new ArrayDeque<>();

        System.out.println("n: ");
        int n = imp.nextInt();

        q.add("1");

        while(n > 0) {
            String value = q.remove();
            System.out.println(value);
            q.add(value + "0");
            q.add(value + "1");
            n--;
        }
    }
}
