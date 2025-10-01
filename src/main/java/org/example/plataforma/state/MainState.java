package org.example.plataforma.state;

public class MainState {
    public static void main(String[] args) {
        System.out.println("=== Plataforma de Aprendizaje en Linea ===");

        //Se crea inscipcion con el estado EN ESPERA
        Inscripcion i = new Inscripcion();

        //La inscripcion pasa a estado INSCRITO
        i.cambiarEstado();

        //La inscripcion pasa a estado CANCELADO
        i.cambiarEstado();

        //Como ya esta en estado CANCELADO muestra mensaje que no se puede cambiar de estado
        i.cambiarEstado();
    }
}