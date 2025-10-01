package org.example.plataforma.memento;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Administra puntos de guardado (mementos).
 */
public class HistorialExamen {
    private final Deque<Examen.Memento> pila = new ArrayDeque<>();

    public void push(Examen.Memento m) {
        pila.push(m);
    }

    public Examen.Memento pop() {
        if (pila.isEmpty())
            throw new IllegalStateException("No hay estados guardados.");
        return pila.pop();
    }

    public boolean hayEstados() {
        return !pila.isEmpty();
    }
}
