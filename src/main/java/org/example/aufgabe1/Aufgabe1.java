package org.example.aufgabe1;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.example.aufgabe1.AbfahrtLexer;

public class Aufgabe1 {
    public static void main(String[] args) {
        String inputFile = "src/main/java/org/example/aufgabe1/abfahrt-kn.txt";
        try {
            String content = new String(Files.readAllBytes(Paths.get(inputFile)));
            AbfahrtLexer lexer = new AbfahrtLexer(CharStreams.fromString(content));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            tokens.fill();

            List<Token> tokenList = tokens.getTokens();
            for (Token token : tokenList) {
                System.out.println("Token: " + token.getText() + " Type: " + lexer.getTokenNames()[token.getType()]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
