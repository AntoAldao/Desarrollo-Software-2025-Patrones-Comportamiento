package org.example.plataforma.visitor;

public abstract class Alumno {

    protected String nombre;
    protected String apellido;
    protected double cuota;
    protected double beneficio;

    public abstract void aceptar (Visitor v);
}
