package org.example.plataforma.mediator;

public class Profesor extends Usuario {
    public Profesor(ChatMediator mediator, String nombre) {
        super(mediator, nombre);
    }

    @Override
    public void recibir(String msg, Usuario remitente) {
        System.out.println("[Profesor " + nombre + " recibió] " + remitente.getNombre() + ": " + msg);
    }
}
