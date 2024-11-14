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
    }

    public String toString() {
        return type + value;
    }

    @Override
    public void accept(ExprVisitor visitor) {
        visitor.visitValue(this);
    }
}
