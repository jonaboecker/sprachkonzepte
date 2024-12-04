package org.example.aufgabe4;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.stream.Collectors;

public final class Functional {
    private Functional() {
    }

    private static final int MIN_LENGTH = 20;

    public static void main(String[] args) throws IOException {
        var input = Paths.get(args[0]);
        var lines = new LinkedList<String>();

        long start = System.nanoTime();

        // Functional operations pipeline
        lines = readLines(Files.newBufferedReader(input));
        lines = removeEmptyLines(lines);
        lines = removeShortLines(lines);
        int n = totalLineLengths(lines);

        long stop = System.nanoTime();

        System.out.printf("result = %d (%d microsec)%n", n, (stop - start) / 1000);
    }

    private static LinkedList<String> readLines(BufferedReader reader) throws IOException {
        return reader.lines().collect(Collectors.toCollection(LinkedList::new));
    }

    private static LinkedList<String> removeEmptyLines(LinkedList<String> lines) {
        return lines.stream()
                .filter(line -> !line.isBlank())
                .collect(Collectors.toCollection(LinkedList::new));
    }

    private static LinkedList<String> removeShortLines(LinkedList<String> lines) {
        return lines.stream()
                .filter(line -> line.length() >= MIN_LENGTH)
                .collect(Collectors.toCollection(LinkedList::new));
    }

    private static int totalLineLengths(LinkedList<String> lines) {
        return lines.stream().mapToInt(String::length).sum();
    }
}
