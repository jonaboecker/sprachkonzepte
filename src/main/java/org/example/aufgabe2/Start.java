package org.example.aufgabe2;

import java.util.ArrayList;
import java.util.List;

public class Start extends ASTNode {
    List<ASTNode> lines;

    Start(List<ASTNode> lines) {
        this.lines = lines;
    }

    public String toString() {
        return lines.toString();
    }

    @Override
    public void accept(ExprVisitor visitor) {
        visitor.visitStart(this);
    }
}
