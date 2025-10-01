package org.example.plataforma.state;

public class Inscrito implements EstadoInscripcion{

    @Override
    public void cambiarEstado(Inscripcion ins){
        System.out.println("Pasando de estado INSCRIPTO a CANCELADO");
        ins.setEstado(new Cancelado());
    }

}
