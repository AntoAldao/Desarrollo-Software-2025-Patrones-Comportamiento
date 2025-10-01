package org.example.plataforma.strategy;

import java.util.List;

public class PromedioPonderado implements CalculoNota{
    //Estategia que calcula la nota usando un promedio ponderado
    // para este ejemplo tomamos pesos fijos para 3 notas
    private final double[] pesos = {0.2, 0.3, 0.5};

    @Override
    public double calcular(List<Integer> notas){
        if (notas.isEmpty() || notas.size()!= pesos.length){
            System.out.println("No se puede calcular el promedio ponderado se requieren "+ pesos.length +" notas ");
            return 0;
        }

        double notaFinal = 0.0;
        for (int i=0; i < notas.size(); i++) {
            notaFinal += notas.get(i) * pesos[i] ;
        }

        return notaFinal;
    }

}
