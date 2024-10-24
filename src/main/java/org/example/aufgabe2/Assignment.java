package org.example.aufgabe2;

public class Assignment extends ASTNode {
    String variable;  // VAR
    ASTNode valueOrExpression;  // entweder ein Wert oder ein Ausdruck

    Assignment(String variable, ASTNode valueOrExpression) {
        this.variable = variable;
        this.valueOrExpression = valueOrExpression;
    }

    public String toString() {
        return variable + " " + valueOrExpression;
    }
}
