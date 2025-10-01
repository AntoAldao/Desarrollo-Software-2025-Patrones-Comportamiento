package org.example;

import org.example.plataforma.chainofresponsibility.ChainOfResponsibilityMain;
import org.example.plataforma.visitor.MainVisitor;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Plataforma de Aprendizaje en Linea ===");

        // Chain of Responsibility
        ChainOfResponsibilityMain.run();


        //Visitor
        MainVisitor.main();
    }
}