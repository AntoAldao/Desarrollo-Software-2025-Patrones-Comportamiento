package org.example.plataforma.chainofresponsibility;

public class Profesor implements Handler {
    private Handler next;

    @Override
    public void setNext(Handler next) {
        this.next = next;
    }

    @Override
    public void handle(Solicitud solicitud) {
        System.out.println("Profesor revisa la solicitud de " + solicitud.getEstudiante());
        if (solicitud.getNivel() == 2) {
            System.out.println("Profesor atiende la solicitud de " + solicitud.getEstudiante() + " sobre " + solicitud.getTema());
        } else if (next != null) {
            System.out.println("Profesor pasa la solicitud a siguiente nivel...");
            next.handle(solicitud);
        }
    }
}