package org.example.aufgabe6;

import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.*;

public class ClassHtmlGenerator {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Bitte geben Sie mindestens eine Klasse oder ein Interface an.");
            return;
        }

        try {
            // Lade die Klassen basierend auf den Argumenten
            List<Class<?>> classes = new ArrayList<>();
            for (String className : args) {
                classes.add(Class.forName(className));
            }

            // Lade das Stringtemplate-Group-File
            STGroup templates = new STGroupFile("src\\main\\java\\org\\example\\aufgabe6\\aufgabe6.stg");
            ST rootTemplate = templates.getInstanceOf("root");

            // Übergabe der Klassen an das Template
            rootTemplate.add("classes", classes);

            // Generiere und gib die HTML-Ausgabe aus
            String output = rootTemplate.render();
            System.out.println(output);

        } catch (ClassNotFoundException e) {
            System.err.println("Klasse oder Interface konnte nicht gefunden werden: " + e.getMessage());
        }
    }

    // Hilfsmethode zur Ermittlung der Methoden eines Interfaces oder einer Klasse
    public static List<String> getMethods(Class<?> clazz) {
        Method[] methods = clazz.getDeclaredMethods();
        List<String> methodDescriptions = new ArrayList<>();
        for (Method method : methods) {
            StringBuilder sb = new StringBuilder();
            sb.append(Modifier.toString(method.getModifiers()))
                    .append(" ")
                    .append(method.getReturnType().getTypeName())
                    .append(" ")
                    .append(method.getName())
                    .append("(");

            Class<?>[] parameterTypes = method.getParameterTypes();
            for (int i = 0; i < parameterTypes.length; i++) {
                if (i > 0) sb.append(", ");
                sb.append(parameterTypes[i].getTypeName());
            }
            sb.append(")");
            methodDescriptions.add(sb.toString());
        }
        return methodDescriptions;
    }
}

