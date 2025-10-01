package org.example.plataforma.visitor;

public class MainVisitor {

    public static void main() {

        System.out.println("\n=== INICIO DE PATRON VISITOR ===\n");
        Alumno a1 = new AlumnoBecado("Ignacio", "Ramos", 500000, 50);
        Alumno a2 = new AlumnoRegular("Ana", "Gonzalez", 500000, 25);

        Visitor aplicarBeca = new AplicarBeca();

        a1.aceptar(aplicarBeca);
        a2.aceptar(aplicarBeca);

        System.out.println("\n=== FIN DE PATRON VISITOR ===\n");
    }
}
