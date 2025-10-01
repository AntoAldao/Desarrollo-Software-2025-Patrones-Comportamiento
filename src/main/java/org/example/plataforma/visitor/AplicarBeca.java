package org.example.plataforma.visitor;

public class AplicarBeca implements Visitor{

    @Override
    public void visitar(AlumnoBecado a) {

        double descuento = a.beneficio * a.cuota / 100;
        System.out.println("Aplicando un descuento de " + descuento + " sobre la cuota al alumno becado.");
    }

    @Override
    public void visitar(AlumnoRegular a) {

        double descuento = a.beneficio * a.cuota / 100;
        System.out.println("Aplicando un descuento de " + descuento + " sobre la cuota al alumno regular.");
    }
}
