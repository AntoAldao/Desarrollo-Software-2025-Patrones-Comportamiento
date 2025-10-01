package org.example.plataforma.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * PATRÓN OBSERVER:
 * Curso es el "Subject" que mantiene y notifica a sus observadores (alumnos).
 */
public class Curso {
    private final String nombre;
    private final List<Observer> observadores = new ArrayList<>();

    public Curso(String nombre) {
        this.nombre = nombre;
    }

    public void inscribir(Observer o) {
        if (!observadores.contains(o))
            observadores.add(o);
    }

    public void desinscribir(Observer o) {
        observadores.remove(o);
    }

    private void notificar(String msg) {
        for (Observer o : observadores) {
            o.update("[" + nombre + "] " + msg);
        }
    }

    // Ejemplos de eventos que disparan notificación
    public void actualizarHorario(String nuevoHorario) {
        notificar("Actualización de horario: " + nuevoHorario);
    }

    public void nuevoAviso(String aviso) {
        notificar("Nuevo aviso: " + aviso);
    }
}
