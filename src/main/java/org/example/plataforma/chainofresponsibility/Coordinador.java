package org.example.plataforma.chainofresponsibility;

public class Coordinador implements Handler {
    private Handler next;

    @Override
    public void setNext(Handler next) {
        this.next = next;
    }

    @Override
    public void handle(Solicitud solicitud) {
        System.out.println("Coordinador revisa la solicitud de " + solicitud.getEstudiante());
        if (solicitud.getNivel() <= 3) {
            System.out.println("Coordinador atiende la solicitud de " + solicitud.getEstudiante() + " sobre " + solicitud.getTema());
        } else if (next != null) {
            System.out.println("Coordinador pasa la solicitud a siguiente nivel...");
            next.handle(solicitud);
        } else {
            System.out.println("Nadie puede atender la solicitud de " + solicitud.getEstudiante());
        }
    }
}