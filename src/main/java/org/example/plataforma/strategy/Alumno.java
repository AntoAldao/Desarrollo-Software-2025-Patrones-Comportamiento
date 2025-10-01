package org.example.plataforma.strategy;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private String nombre;
    private List<Integer> notas = new ArrayList<>();
    private CalculoNota estrategia;

    public Alumno(String nombre){
        this.nombre = nombre;
    }

    public Alumno(String nombre, CalculoNota estrategia){
        this.nombre = nombre;
        this.estrategia = estrategia;
    }

    public void setEstrategia(CalculoNota estrategia) {
        this.estrategia = estrategia;
    }

    public void addNota(int nota) {
        notas.add(nota);
    }

    public void calcularNotaFinal(){
        System.out.println("Calculuando nota para "+nombre+": ");
        double notaFinal = this.estrategia.calcular(this.notas);
        System.out.println("Estrategia utilizada: "+estrategia.getClass().getSimpleName());
        System.out.println("Las notas son: "+notas.toString());
        System.out.println("La nota final es: "+notaFinal);
    }

}
