package org.example.plataforma.state;

public class Inscripcion {
    private EstadoInscripcion estado;

    public Inscripcion(){
        estado = new EnEspera(); // Estado incial
        System.out.println("Su inscripcion ha sido creada y esta en estado EN ESPERA");
    }

    public void setEstado(EstadoInscripcion estado){
        this.estado = estado;
    }

    public void cambiarEstado(){
        estado.cambiarEstado(this);
    }
}
