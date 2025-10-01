// src/main/java/app/Main.java
package org.example.plataforma.observer;

/**
 * MAIN ÚNICO CON EJEMPLOS
 */
public class MainObserver {
    public static void main(String[] args) {

        System.out.println("== DEMO OBSERVER ==");
        Curso poo = new Curso("Programación OO");
        Observer ana = new Alumno("Ana");
        Observer luis = new Alumno("Luis");

        poo.inscribir(ana);
        poo.inscribir(luis);

        poo.actualizarHorario("Lunes y Miércoles 18:00-20:00");
        poo.nuevoAviso("Subido material de la Unidad 2");

        poo.desinscribir(luis);
        poo.nuevoAviso("Parcial el 15/10");
    }
}