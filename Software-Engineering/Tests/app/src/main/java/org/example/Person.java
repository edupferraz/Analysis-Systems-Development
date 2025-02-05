package org.example;

import java.security.InvalidParameterException;

public class Person {

    private String name;
    private String cpf;

    public Person(String name, String cpf) {
        setName(name);
        setCpf(cpf);
    }

    public String getName() {
        return name;
    }

    public Boolean setName(String name) {

        if (name == null)
            throw new InvalidParameterException("Name cannot be null");

        if (name.isEmpty())
            throw new InvalidParameterException("Name cannot be empty");

        if (name.split(" ").length >= 2) {
            this.name = name;
            return true;
        } else {
            throw new InvalidParameterException("Name is not valid");
        }
    }

    public String getCpf() {
        return cpf;
    }

    public Boolean setCpf(String cpf) {

        if (cpf == null) {
            throw new InvalidParameterException("CPF cannot be null");
        }

        if (validateCpf(cpf)) {
            this.cpf = cpf;
            return true;
        } else {
            throw new InvalidParameterException("CPF is not valid");
        }
    }

    public static boolean validateCpf(String cpf) {
        // Remove non-numeric characters
        cpf = cpf.replaceAll("[^0-9]", "");

        // Check if it has 11 digits
        if (cpf.length() != 11) {
            return false;
        }

        // Check if all digits are the same (invalid case)
        if (cpf.matches("(\\d)\\1{10}")) {
            return false;
        }

        // Calculate the first verification digit
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            sum += (cpf.charAt(i) - '0') * (10 - i);
        }
        int firstDigit = 11 - (sum % 11);
        if (firstDigit >= 10) {
            firstDigit = 0;
        }

        // Verify the first verification digit
        if (firstDigit != (cpf.charAt(9) - '0')) {
            return false;
        }

        // Calculate the second verification digit
        sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += (cpf.charAt(i) - '0') * (11 - i);
        }
        int secondDigit = 11 - (sum % 11);
        if (secondDigit >= 10) {
            secondDigit = 0;
        }

        // Verify the second verification digit
        return secondDigit == (cpf.charAt(10) - '0');
    }
}