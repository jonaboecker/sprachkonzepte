package org.example.aufgabe2;

import java.util.Objects;

public class Expression extends ASTNode {
    ASTNode left;
    String operator;  // ADD, SUB, MUL, DIV
    ASTNode right;

    Expression(ASTNode left, String operator, ASTNode right) {
        this.left = left;
        this.operator = operator;
        this.right = right;
        if (!operator.equals("+") && (((Value)left).type.equals("string") || ((Value)right).type.equals("string"))) {
            throw new IllegalArgumentException("Both operands must not be of type string");
        }
    }

    public String toString() {
        return "(" + left + " " + operator + " " + right + ")";
    }
}
