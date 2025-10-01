package org.example.plataforma.iterator;

import java.util.Iterator;
import java.util.List;

public class CursoIterator implements Iterator<Curso> {
    private final List<Curso> cursos;
    private int posicion;

    public CursoIterator(List<Curso> cursos) {
        this.cursos = cursos;
        this.posicion = 0;
    }

    @Override
    public boolean hasNext() {
        return posicion < cursos.size();
    }

    @Override
    public Curso next() {
        return cursos.get(posicion++);
    }
}
