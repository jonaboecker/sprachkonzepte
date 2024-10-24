package org.example.aufgabe2;

import java.util.List;

public class IfStatement extends ASTNode {
    ASTNode condition;  // comp
    List<ASTNode> thenLines;  // Anweisungen im Rumpf der If-Anweisung

    IfStatement(ASTNode condition, List<ASTNode> thenLines) {
        this.condition = condition;
        this.thenLines = thenLines;
    }

    public String toString() {
        return "if ( " + condition + " ){ " + thenLines + " }";
    }
}
