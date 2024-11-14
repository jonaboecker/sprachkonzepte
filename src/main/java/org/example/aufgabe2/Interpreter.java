package org.example.aufgabe2;

public final class Interpreter implements ExprVisitor {
    private String result;

    public String interpret(ASTNode node) {
        node.accept(this);
        return result;
    }

    @Override
    public void visitExpression(Expression expression) {
        expression.left.accept(this);
        String left = result;
        expression.right.accept(this);
        String right = result;
        if (((Value) expression.left).type.equals("string") || ((Value) expression.right).type.equals("string")) {
            result = left + right;
        } else {
            int leftInt = Integer.parseInt(left);
            int rightInt = Integer.parseInt(right);
            switch (expression.operator) {
                case "+":
                    result = Integer.toString(leftInt + rightInt);
                    break;
                case "-":
                    result = Integer.toString(leftInt - rightInt);
                    break;
                case "*":
                    result = Integer.toString(leftInt * rightInt);
                    break;
                case "/":
                    result = Integer.toString(leftInt / rightInt);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown operator: " + expression.operator);
            }
        }
    }

    @Override
    public void visitValue(Value value) {
        result = value.value;
    }

    @Override
    public void visitAssignment(Assignment assignment) {
        assignment.valueOrExpression.accept(this);
        result = assignment.variable + " = " + result;
    }

    @Override
    public void visitComparison(Comparison comparison) {
        comparison.left.accept(this);
        String left = result;
        comparison.right.accept(this);
        String right = result;
        if (((Value) comparison.left).type.equals("string") || ((Value) comparison.right).type.equals("string")) {
            switch (comparison.operator) {
                case "==":
                    result = Boolean.toString(left.equals(right));
                    break;
                case "!=":
                    result = Boolean.toString(!left.equals(right));
                    break;
                default:
                    throw new IllegalArgumentException("Unknown operator: " + comparison.operator);
            }
        } else {
            int leftInt = Integer.parseInt(left);
            int rightInt = Integer.parseInt(right);

            switch (comparison.operator) {
                case "==":
                    result = Boolean.toString(leftInt == rightInt);
                    break;
                case "!=":
                    result = Boolean.toString(leftInt != rightInt);
                    break;
                case "<":
                    result = Boolean.toString(leftInt < rightInt);
                    break;
                case ">":
                    result = Boolean.toString(leftInt > rightInt);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown operator: " + comparison.operator);
            }
        }
    }

    @Override
    public void visitIfStatement(IfStatement ifStatement) {
        ifStatement.condition.accept(this);
        if (Boolean.parseBoolean(result)) {
            ifStatement.accept(this);
        }
    }

    @Override
    public void visitStart(Start start) {
        StringBuilder tempResult = new StringBuilder();
        for (ASTNode node : start.lines) {
            node.accept(this);
            tempResult.append(result).append("\n");
        }
        result = tempResult.toString();
    }
}
