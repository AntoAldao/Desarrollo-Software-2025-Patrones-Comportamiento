package org.example.plataforma.strategy;

import java.util.List;

public class ExamenExtra implements CalculoNota{
    //Para esta estrategia se calcula la nota final como un promedio simpleo
    // y se asume que se toma un examen que suma un punto a la nota final
    private final double BONUS_EXAMEN = 1.0;
    private final double NOTA_MAXIMA = 10.0;

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
        double promedioBase = sum/cantidad_notas;
        double notaConBono = promedioBase + BONUS_EXAMEN;

        // Devuelve la nota con bono pero sin que pase la nota maxima de 10
        return Math.min(notaConBono, NOTA_MAXIMA);
    }

}
