package org.example.aufgabe2;

abstract class ASTNode {
    public abstract void accept(ExprVisitor visitor);
}
