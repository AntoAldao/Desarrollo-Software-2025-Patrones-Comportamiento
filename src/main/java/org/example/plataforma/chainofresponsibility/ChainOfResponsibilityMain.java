package org.example.plataforma.chainofresponsibility;

public class ChainOfResponsibilityMain {
    public static void run()  {
        System.out.println("\n--- INICIO CHAIN OF RESPONSIBILITY ---");

        // Crear handlers
        Handler asistente = new Asistente();
        Handler profesor = new Profesor();
        Handler coordinador = new Coordinador();

        // Encadenar
        asistente.setNext(profesor);
        profesor.setNext(coordinador);

        // Crear solicitudes
        Solicitud s1 = new Solicitud("Juan", "Dudas de Java", 1);
        Solicitud s2 = new Solicitud("Maria", "Proyecto final", 1);
        Solicitud s3 = new Solicitud("Luis", "Problemas administrativos", 2);
        Solicitud s4 = new Solicitud("Romina", "Problemas Generales", 3);

        // Procesar solicitudes
        asistente.handle(s1);
        System.out.println( "Finalizada la solicitud de Juan\n");
        asistente.handle(s2);
        System.out.println( "Finalizada la solicitud de Maria\n");
        asistente.handle(s3);
        System.out.println( "Finalizada la solicitud de Luis\n");
        asistente.handle(s4);
        System.out.println( "Finalizada la solicitud de Romina\n");

        System.out.println("=== FIN CHAIN OF RESPONSIBILITY === \n\n" );
    }
}
