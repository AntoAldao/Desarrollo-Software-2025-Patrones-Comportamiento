package org.example.plataforma.memento;

/**
 * MAIN ÚNICO CON EJEMPLOS
 */
public class MainMemento {
    public static void main(String[] args) {

        System.out.println("== DEMO MEMENTO ==");
        Examen examen = new Examen("alumno-123");
        HistorialExamen historial = new HistorialExamen();

        examen.responder(1, "B");
        examen.responder(2, "C");
        historial.push(examen.save()); // guardo checkpoint 1
        System.out.println("Progreso 1: " + examen);

        examen.responder(3, "A");
        historial.push(examen.save()); // guardo checkpoint 2
        System.out.println("Progreso 2: " + examen);

        // El alumno decide volver al checkpoint anterior
        examen.restore(historial.pop());
        System.out.println("Restaurado a Progreso 2: " + examen);

        // Y puede volver aún más atrás
        examen.restore(historial.pop());
        System.out.println("Restaurado a Progreso 1: " + examen);

    }
}