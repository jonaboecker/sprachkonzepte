package org.example.aufgabe2;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

// IntelliJ sometimes thinks we need this import, but we don't
import org.example.aufgabe2.JontobParserBaseListener;
import org.example.aufgabe2.JontobParser;

public final class ASTBuilder extends JontobParserBaseListener {
    private final Stack<ASTNode> stack = new Stack<ASTNode>();

    private int numberOfSemanticErrors;

    private void semanticError(Token t, String error) {
        this.numberOfSemanticErrors++;
        System.err.printf("line %d column %d: %s%n",
                t.getLine(), t.getCharPositionInLine(), error);
    }

    public int getNumberOfSemanticErrors() {
        return this.numberOfSemanticErrors;
    }

    public ASTNode build(ParseTree tree) {
        new ParseTreeWalker().walk(this, tree);
        return this.stack.pop();
    }

    @Override
    public void exitValue(JontobParser.ValueContext ctx) {
        Value v = new Value(ctx.getChild(0).getText());
        this.stack.push(v);
        switch  (v.type) {
            case "int":
                try {
                    Integer.parseInt(v.value);
                } catch (NumberFormatException e) {
                    semanticError(ctx.INT().getSymbol(), "Invalid integer value");
                }
                break;
            case "var":
                if (v.value.length() > 20) {
                    semanticError(ctx.VAR().getSymbol(), "Variable name is too long");
                }
                break;
        }
    }

    @Override
    public void exitExpr(JontobParser.ExprContext ctx) {
        ASTNode right = this.stack.pop();
        ASTNode left = this.stack.pop();
        String op = ctx.getChild(1).getText();
        Expression exp = new Expression(left, op, right);
        this.stack.push(exp);
        if (op.equals("-") && (((Value)left).type.equals("string")) || ((Value)right).type.equals("string")) {
            semanticError(ctx.SUB().getSymbol(), "Strings cant be subtracted");
        } else if (op.equals("*") && (((Value)left).type.equals("string") || ((Value)right).type.equals("string"))) {
            semanticError(ctx.MUL().getSymbol(), "Strings cant be multiplied");
        } else if (op.equals("/") && (((Value)left).type.equals("string") || ((Value)right).type.equals("string"))) {
            semanticError(ctx.DIV().getSymbol(), "Strings cant be divided");
        }
    }

    @Override
    public void exitAssign(JontobParser.AssignContext ctx) {
        String var = ctx.getChild(0).getText();
        ASTNode value = this.stack.pop();
        this.stack.push(new Assignment(var, value));
    }

    @Override
    public void exitComp(JontobParser.CompContext ctx) {
        ASTNode right = this.stack.pop();
        ASTNode left = this.stack.pop();
        String op = ctx.getChild(1).getText();
        this.stack.push(new Comparison(left, op, right));
    }

    @Override
    public void exitIf(JontobParser.IfContext ctx) {
        List<ASTNode> lines = new ArrayList<>();
        int statements = (ctx.getChildCount() - 6) / 2;
        for (int i = 0; i < statements; i++) {
            lines.add(this.stack.pop());
        }
        ASTNode stm = this.stack.pop();
        this.stack.push(new IfStatement(stm, lines.reversed()));
    }

    @Override
    public void exitStart(JontobParser.StartContext ctx) {
        List<ASTNode> lines = new ArrayList<>();
        int statements = (ctx.getChildCount() - 1) / 2;
        for (int i = 0; i < statements; i++) {
            lines.add(this.stack.pop());
        }
        this.stack.push(new Start(lines.reversed()));
    }
}
