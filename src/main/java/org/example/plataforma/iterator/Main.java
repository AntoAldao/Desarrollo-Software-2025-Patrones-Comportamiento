package org.example.plataforma.iterator;

import org.example.plataforma.command.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n--- INICIO ITERATOR ---");

        Alumno alumno = new Alumno("Juan");
        alumno.inscribirCurso(new Curso("Matemáticas"));
        alumno.inscribirCurso(new Curso("Historia"));
        alumno.inscribirCurso(new Curso("Física"));

        CursoIterator iterator = new CursoIterator(alumno.getCursos());

        System.out.println("Cursos inscritos por " + alumno.getNombre() + ":");
        while (iterator.hasNext()) {
            System.out.println("- " + iterator.next().getNombre());
        }

        System.out.println("=== FIN ITERATOR ===\n");
    }
}