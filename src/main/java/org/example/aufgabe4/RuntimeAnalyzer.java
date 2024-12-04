package org.example.aufgabe4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;

public class RuntimeAnalyzer {
    public static void main(String[] args) throws Exception {

        String input = "src/main/java/org/example/aufgabe4/bsp.txt";
        System.out.println("Procedural:");
        Procedural.main(new String[]{input});
        System.out.println("Functional:");
        Functional.main(new String[]{input});
    }
}