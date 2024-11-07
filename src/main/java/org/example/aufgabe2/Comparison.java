package org.example.aufgabe2;

public class Comparison extends ASTNode {
    ASTNode left;
    String operator;  // EQUAL, NEQUAL, LT, GT
    ASTNode right;

    Comparison(ASTNode left, String operator, ASTNode right) {
        this.left = left;
        this.operator = operator;
        this.right = right;
        if ((operator.equals("<") || (operator.equals(">"))) && (((Value)left).type.equals("string") || ((Value)right).type.equals("string"))) {
            throw new IllegalArgumentException("Both operands must not be of type string");
        }
    }

    public String toString() {
        return "(" + left + " " + operator + " " + right + ")";
    }
}
