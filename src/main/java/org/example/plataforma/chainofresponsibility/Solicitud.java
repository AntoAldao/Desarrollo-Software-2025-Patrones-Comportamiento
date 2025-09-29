package org.example.plataforma.chainofresponsibility;

public class Solicitud {
    private String estudiante;
    private String tema;
    private int nivel; // 1 = Asistente, 2 = Profesor, 3 = Coordinador

    public Solicitud(String estudiante, String tema, int nivel) {
        this.estudiante = estudiante;
        this.tema = tema;
        this.nivel = nivel;
    }

    public String getEstudiante() { return estudiante; }
    public String getTema() { return tema; }
    public int getNivel() { return nivel; }
}