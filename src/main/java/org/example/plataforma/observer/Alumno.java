package org.example.plataforma.observer;

/**
 * Observador concreto: Alumno que recibe notificaciones del Curso.
 */
public class Alumno implements Observer {
    private final String nombre;

    public Alumno(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void update(String msg) {
        System.out.println("[Notificación a " + nombre + "] " + msg);
    }

    @Override
    public String nombre() {
        return nombre;
    }
}
