package org.example.aufgabe2;

// ExprToAst.java
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

// IntelliJ sometimes thinks we need this import, but we don't
import org.example.aufgabe2.JontobLexer;
import org.example.aufgabe2.JontobParser;

import java.io.FileInputStream;
import java.io.InputStream;

public final class ExprToAst {
    private ExprToAst() { }

    public static void main(String[] args) throws Exception {
        InputStream targetStream = new FileInputStream("src/main/java/org/example/aufgabe2/bsp1.txt");
        JontobLexer lexer = new JontobLexer(CharStreams.fromStream(targetStream));
        JontobParser parser = new JontobParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.start();
        if (parser.getNumberOfSyntaxErrors() > 0) {
            System.err.printf("%d error(s) detected%n", parser.getNumberOfSyntaxErrors());
            System.exit(1);
        }

        ASTNode ast = new ASTBuilder().build(tree);
        System.out.printf("Expr.toString() = \"%s\"%n", ast);
    }
}

