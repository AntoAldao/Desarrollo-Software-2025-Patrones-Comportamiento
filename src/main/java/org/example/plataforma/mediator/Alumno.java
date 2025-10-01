package org.example.plataforma.mediator;

public class Alumno extends Usuario {
    public Alumno(ChatMediator mediator, String nombre) {
        super(mediator, nombre);
    }

    @Override
    public void recibir(String msg, Usuario remitente) {
        System.out.println("[Alumno " + nombre + " recibió] " + remitente.getNombre() + ": " + msg);
    }
}
