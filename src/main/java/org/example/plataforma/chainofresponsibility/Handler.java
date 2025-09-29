package org.example.plataforma.chainofresponsibility;

public interface Handler {
    void setNext(Handler next);
    void handle(Solicitud solicitud);
}
