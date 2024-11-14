package org.example.aufgabe2;

public interface ExprVisitor {
    default void visitExpression(Expression expression) {
        expression.left.accept(this);
        expression.right.accept(this);
    }

    default void visitValue(Value value) { }

    default void visitAssignment(Assignment assignment) { }

    default void visitComparison(Comparison comparison) { }

    default void visitIfStatement(IfStatement ifStatement) { }

    default void visitStart(Start start) { }
}
