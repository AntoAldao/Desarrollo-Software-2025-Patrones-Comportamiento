package org.example.plataforma.chainofresponsibility;

public class ReporteCurso extends ReporteAcademico{
    private String curso;
    private String desempeño;
    private Solicitud solicitud;

    public ReporteCurso(Solicitud solicitud, String curso, String desempeño) {
        this.solicitud = solicitud;
        this.curso = curso;
        this.desempeño = desempeño;
    }

    @Override
    protected void imprimirContenido() {
        System.out.println("Alumno: " + solicitud.getEstudiante());
        System.out.println("Curso: " + curso);
        System.out.println("Tema: " + solicitud.getTema());
        System.out.println("Desempeño: " + desempeño);
    }
}
