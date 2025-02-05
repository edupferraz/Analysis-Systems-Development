package org.example;

import org.junit.jupiter.api.Test;

import java.security.InvalidParameterException;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PersonTest {

    @Test
    void constructor() {
        // Test invalid inputs for constructor
        assertThrows(InvalidParameterException.class, () -> {
            Person p = new Person(null, null);
        });

        assertThrows(InvalidParameterException.class, () -> {
            Person p = new Person("", null);
        });

        assertThrows(InvalidParameterException.class, () -> {
            Person p = new Person(null, "");
        });

        assertThrows(InvalidParameterException.class, () -> {
            Person p = new Person("", "");
        });

        assertThrows(InvalidParameterException.class, () -> {
            Person p = new Person("Eduardo", "12345678909"); // Invalid CPF
        });

        assertThrows(InvalidParameterException.class, () -> {
            Person p = new Person("Eduardo Ferraz", "12345678920"); // Invalid CPF
        });

        // Test valid inputs for constructor
        assertDoesNotThrow(() -> {
            Person p = new Person("Eduardo Ferraz", "08730718910"); // Valid CPF
        });
    }

    @Test
    void setName() {
        Person p = new Person("Eduardo Teste", "08730718910");

        // Verify initial name
        assertEquals("Eduardo Teste", p.getName());

        // Test invalid names
        assertThrows(InvalidParameterException.class, () -> {
            p.setName("Eduardo"); // Single name (invalid)
        });

        assertThrows(InvalidParameterException.class, () -> {
            p.setName(""); // Empty name (invalid)
        });

        assertThrows(InvalidParameterException.class, () -> {
            p.setName(null); // Null name (invalid)
        });

        // Verify name remains unchanged after invalid attempts
        assertEquals("Eduardo Teste", p.getName());

        // Test valid name change
        assertDoesNotThrow(() -> {
            p.setName("Fa Sa"); // Valid name
        });

        // Verify new name
        assertEquals("Fa Sa", p.getName());

        // Test another valid name change
        assertDoesNotThrow(() -> {
            p.setName("Eduardo Teste"); // Valid name
        });
    }

    @Test
    void setCpf() {
        // Add tests for setCpf method here
    }

    @Test
    void validateCpf() {
        // Add tests for validateCpf method here
    }
}