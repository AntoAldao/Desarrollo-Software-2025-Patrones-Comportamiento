package org.example;

import org.example.plataforma.chainofresponsibility.ChainOfResponsibilityMain;
import org.example.plataforma.command.CommandMain;
import org.example.plataforma.iterator.IteratorMain;
import org.example.plataforma.visitor.MainVisitor;
import org.example.template.MainTemplate;
import org.example.template.TemplateMain;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Plataforma de Aprendizaje en Linea ===");

        // Chain of Responsibility
        ChainOfResponsibilityMain.run();
      
        // Command
        CommandMain.run();

        // Iterator
        IteratorMain.run();
      
        //Visitor
        MainVisitor.main();

        //Template
        TemplateMain.run();
    }
}