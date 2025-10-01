package org.example.template;

import org.example.plataforma.chainofresponsibility.Solicitud;

public class TemplateMain {
    public static void run()  {
        //Metodo template
        System.out.println("--- Metodo Template ---");

        // Crear solicitudes
        Solicitud s1 = new Solicitud("Juan", "Dudas de Java", 1);
        Solicitud s2 = new Solicitud("Maria", "Proyecto final", 1);
        Solicitud s3 = new Solicitud("Luis", "Problemas administrativos", 2);
        Solicitud s4 = new Solicitud("Romina", "Problemas Generales", 3);

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
