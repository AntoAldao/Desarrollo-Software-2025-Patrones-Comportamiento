package org.example.plataforma.visitor;

public interface Visitor {

    void visitar(AlumnoBecado a);
    void visitar(AlumnoRegular a);
}
