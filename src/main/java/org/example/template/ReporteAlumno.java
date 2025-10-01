package org.example.template;

import org.example.plataforma.chainofresponsibility.Solicitud;

public class ReporteAlumno extends ReporteAcademico {
    private Solicitud solicitud;
    private double promedio;

    public ReporteAlumno(Solicitud solicitud, double promedio) {
        this.solicitud = solicitud;
        this.promedio = promedio;
    }

    @Override
    protected void imprimirContenido() {
        System.out.println("Alumno: " + solicitud.getEstudiante());
        System.out.println("Tema de solicitud: " + solicitud.getTema());
        System.out.println("Nivel de solicitud: " + solicitud.getNivel());
        System.out.println("Promedio: " + promedio);
    }
}
