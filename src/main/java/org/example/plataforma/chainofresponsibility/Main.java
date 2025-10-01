package org.example.plataforma.chainofresponsibility;

import org.example.template.ReporteAcademico;
import org.example.template.ReporteAlumno;
import org.example.template.ReporteCurso;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n--- Chain of Responsibility Main ---");

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
        //Metodo template
        System.out.println("--- Metodo Template ---");

        ReporteAcademico reporteAlumnoS1 = new ReporteAlumno(s1,8);
        ReporteAcademico reporteAlumnoS2 = new ReporteAlumno(s2,8);
        ReporteAcademico reporteAlumnoS3 = new ReporteAlumno(s3,9);
        ReporteAcademico reporteAlumnoS4 = new ReporteAlumno(s4,7);
        reporteAlumnoS1.generarReporte();
        reporteAlumnoS2.generarReporte();
        reporteAlumnoS3.generarReporte();
        reporteAlumnoS4.generarReporte();

        ReporteAcademico reporteCursoS1 = new ReporteCurso(s1,"Programacion Avanzada", "Experto");
        reporteCursoS1.generarReporte();
    }
}