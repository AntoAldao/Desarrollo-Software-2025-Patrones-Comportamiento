package org.example.plataforma.strategy;

public class MainStrategy {
    public static void main(String[] args) {
        CalculoNota promedioSimple = new PromedioSimple();
        CalculoNota promedioPonderado = new PromedioPonderado();
        CalculoNota examenExtra = new ExamenExtra();

        Alumno alumno = new Alumno("Juan");
        alumno.addNota(10);
        alumno.addNota(7);
        alumno.addNota(5);
        System.out.println("=== ESTRATEGIA DE PROMEDIO SIMPLE === ");
        alumno.setEstrategia(promedioSimple);
        alumno.calcularNotaFinal();
        System.out.println("=== ESTRATEGIA DE PROMEDIO PONDERADO ===");
        alumno.setEstrategia(promedioPonderado);
        alumno.calcularNotaFinal();
        System.out.println("=== ESTRATEGIA CON EXAMEN EXTRA === ");
        alumno.setEstrategia(examenExtra);
        alumno.calcularNotaFinal();
    }
}
