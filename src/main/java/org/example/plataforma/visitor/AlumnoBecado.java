package org.example.plataforma.visitor;

public class AlumnoBecado extends Alumno{

    public AlumnoBecado(String nombre,String apellido, double couta, double beneficio){
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuota = couta;
        this.beneficio = beneficio;
    }

    @Override
    public void aceptar (Visitor v){
        v.visitar(this);
    }
}
