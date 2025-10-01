package org.example.plataforma.state;

public class Cancelado implements EstadoInscripcion{

    @Override
    public void cambiarEstado(Inscripcion ins){
        System.out.println("Su inscipcion ya esta en estado CANCELADO. No se puede cambiar el estado.");
        ins.setEstado(new Cancelado());
    }

}
