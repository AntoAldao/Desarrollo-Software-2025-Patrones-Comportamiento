package org.example.plataforma.chainofresponsibility;

public abstract class ReporteAcademico {
    //Templeate Metho: define el flujo del algoritmo
    public final void generarReporte(){
        imprimirEncabezado();
        imprimirContenido();
        imprimirPie();
    }

    // Pasos comunes
    protected void imprimirEncabezado() {
        System.out.println("=== REPORTE ACADÉMICO ===");
    }

    protected void imprimirPie() {
        System.out.println("=== FIN REPORTE ===\n");
    }

    // Paso abstracto → lo personalizan las subclases
    protected abstract void imprimirContenido();
}
