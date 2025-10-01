package org.example.plataforma.memento;

import java.util.*;

/**
 * PATRÓN MEMENTO:
 * Examen crea Mementos inmutables con el estado de las respuestas.
 */
public class Examen {
    private final String alumnoId;
    private final Map<Integer, String> respuestas = new LinkedHashMap<>();

    public Examen(String alumnoId) {
        this.alumnoId = alumnoId;
    }

    public void responder(int numeroPregunta, String respuesta) {
        respuestas.put(numeroPregunta, respuesta);
    }

    public String respuestaDe(int numeroPregunta) {
        return respuestas.get(numeroPregunta);
    }

    public int totalRespondidas() {
        return respuestas.size();
    }

    public Memento save() {
        // copia defensiva para inmutabilidad del memento
        return new Memento(alumnoId, new LinkedHashMap<>(respuestas));
    }

    public void restore(Memento m) {
        if (!Objects.equals(alumnoId, m.alumnoId)) {
            throw new IllegalStateException("El memento no pertenece a este examen.");
        }
        respuestas.clear();
        respuestas.putAll(m.respuestasSnapshot);
    }

    public static class Memento {
        private final String alumnoId;
        private final Map<Integer, String> respuestasSnapshot;

        private Memento(String alumnoId, Map<Integer, String> snapshot) {
            this.alumnoId = alumnoId;
            this.respuestasSnapshot = Collections.unmodifiableMap(snapshot);
        }
    }

    @Override
    public String toString() {
        return "Examen{" +
                "alumnoId='" + alumnoId + '\'' +
                ", respuestas=" + respuestas +
                '}';
    }
}
