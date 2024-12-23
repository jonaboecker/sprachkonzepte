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
    }

    public String toString() {
        return "(" + left + " " + operator + " " + right + ")";
    }

    @Override
    public void accept(ExprVisitor visitor) {
        visitor.visitExpression(this);
    }
}
