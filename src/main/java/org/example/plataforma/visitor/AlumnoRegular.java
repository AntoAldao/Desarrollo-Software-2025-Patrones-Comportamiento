package org.example.plataforma.visitor;

import java.util.*;



class AlumnoRegular  extends Alumno{

    public AlumnoRegular(String nombre,String apellido, double couta, double beneficio){
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
