package org.example.aufgabe2;

import java.util.Hashtable;

public final class Interpreter implements ExprVisitor {
    private String result;

    private Hashtable<String, String> variables = new Hashtable<>();

    public String interpret(ASTNode node) {
        node.accept(this);
        return result;
    }

    @Override
    public void visitExpression(Expression expression) {
        Value left = getRealValue((Value) expression.left);
        Value right = getRealValue((Value) expression.right);
        if (left.type.equals("string") || right.type.equals("string")) {
            result = left.value + right.value;
        } else {
            int leftInt = Integer.parseInt(left.value);
            int rightInt = Integer.parseInt(right.value);
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
        variables.put(new Value (assignment.variable).value, result);
        result = assignment.variable + " = " + result;
    }

    @Override
    public void visitComparison(Comparison comparison) {

        Value left = getRealValue((Value) comparison.left);
        Value right = getRealValue((Value) comparison.right);

        if (left.type.equals("string") || right.type.equals("string")) {
            switch (comparison.operator) {
                case "=":
                    result = Boolean.toString(left.equals(right));
                    break;
                case "!":
                    result = Boolean.toString(!left.equals(right));
                    break;
                default:
                    throw new IllegalArgumentException("Unknown operator: " + comparison.operator);
            }
        } else {
            int leftInt = Integer.parseInt(left.value);
            int rightInt = Integer.parseInt(right.value);

            switch (comparison.operator) {
                case "=":
                    result = Boolean.toString(leftInt == rightInt);
                    break;
                case "!":
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
            for (ASTNode node : ifStatement.thenLines) {
                node.accept(this);
            }
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

    private Value getRealValue(Value value) {
        var temp = variables.get(value.value);
        if (temp == null) {
            return value;
        } else {
            try {
                return new Value("int" + Integer.parseInt(temp));
            } catch (NumberFormatException e) {
                return new Value("string" + temp);
            }
        }
    }
}
