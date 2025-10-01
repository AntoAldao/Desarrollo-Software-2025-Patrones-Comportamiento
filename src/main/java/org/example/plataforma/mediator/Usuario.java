package org.example.plataforma.mediator;

/**
 * Clase base para participantes del chat.
 */
public abstract class Usuario {
    protected ChatMediator mediator;
    protected String nombre;

    public Usuario(ChatMediator mediator, String nombre) {
        this.mediator = mediator;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void enviar(String msg) {
        mediator.enviar(msg, this);
    }

    public abstract void recibir(String msg, Usuario remitente);
}
