package org.example.plataforma.state;

public class EnEspera implements EstadoInscripcion{

    @Override
    public void cambiarEstado(Inscripcion ins){
        System.out.println("Pasando de estado EN ESPERA a INSCRITO");
        ins.setEstado(new Inscrito());
    }
}
