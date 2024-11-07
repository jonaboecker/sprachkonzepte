package org.example.aufgabe2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Value extends ASTNode {
    String value;  // INT, STRING oder VAR
    String type;  // INT, STRING oder VAR

    Value(String value) {
        if(value.matches("int.*")){
            this.type = "int";
        } else if(value.matches("string.*")){
            this.type = "string";
        } else if(value.matches("var.*")){
            this.type = "var";
        }
        this.value = value.split("int|string|var")[1];
        switch  (this.type) {
            case "int":
                var foo = Integer.parseInt(this.value);
                break;
            case "var":
                if (this.value.length() > 20) {
                    throw new IllegalArgumentException("Variable name is too long");
                }
                break;
        }
    }

    public String toString() {
        return type + value;
    }
}
