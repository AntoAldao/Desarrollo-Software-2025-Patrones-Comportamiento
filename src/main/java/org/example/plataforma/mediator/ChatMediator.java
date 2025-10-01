package org.example.plataforma.mediator;

public interface ChatMediator {
    void enviar(String msg, Usuario remitente);

    void registrar(Usuario u);
}