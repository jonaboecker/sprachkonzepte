package org.example.aufgabe2;

public class Comparison extends ASTNode {
    ASTNode left;
    String operator;  // EQUAL, NEQUAL, LT, GT
    ASTNode right;

    Comparison(ASTNode left, String operator, ASTNode right) {
        this.left = left;
        this.operator = operator;
        this.right = right;
    }

    public String toString() {
        return "(" + left + " " + operator + " " + right + ")";
    }
}
