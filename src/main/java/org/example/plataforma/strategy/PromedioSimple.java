package org.example.plataforma.strategy;

import java.util.List;

import static java.lang.Math.round;

public class PromedioSimple implements CalculoNota{
    //Estrategia que calcula la nota final como un promedio simple

    @Override
    public double calcular(List<Integer> notas){
        if (notas.isEmpty() || notas == null){
            return 0;
        }
        int cantidad_notas = notas.size();
        double sum = 0.0;
        for (int nota : notas){
            sum += nota;
        }
        return sum/cantidad_notas;
    }
}
