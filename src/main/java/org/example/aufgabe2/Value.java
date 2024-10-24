package org.example.aufgabe2;

public class Value extends ASTNode {
    String value;  // INT, STRING oder VAR

    Value(String value) {
        this.value = value;
    }

    public String toString() {
        return value;
    }
}
