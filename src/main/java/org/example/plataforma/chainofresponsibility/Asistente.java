package org.example.plataforma.chainofresponsibility;

public class Asistente implements Handler {
    private Handler next;

    @Override
    public void setNext(Handler next) {
        this.next = next;
    }

    @Override
    public void handle(Solicitud solicitud) {
        System.out.println("Asistente revisa la solicitud de " + solicitud.getEstudiante());
        if (solicitud.getNivel() <= 1) {
            System.out.println("Asistente atiende la solicitud de " + solicitud.getEstudiante() + " sobre " + solicitud.getTema());
        } else if (next != null) {
            System.out.println("Asistente pasa la solicitud a siguiente nivel...");
            next.handle(solicitud);
        }
    }
}
