package org.example.plataforma.mediator;

/**
 * MAIN CON EJEMPLOS
 */
public class MainMediator {
    public static void main(String[] args) {

        System.out.println("== DEMO MEDIATOR ==");
        ChatMediator chat = new ChatRoom();

        Usuario alumno1 = new Alumno(chat, "Ana");
        Usuario alumno2 = new Alumno(chat, "Luis");
        Usuario profe = new Profesor(chat, "Prof. Gómez");

        chat.registrar(alumno1);
        chat.registrar(alumno2);
        chat.registrar(profe);

        alumno1.enviar("Hola a todos, ¿la clase empieza 18:00?");
        profe.enviar("Sí Ana, hoy a las 18:00 en el aula virtual.");
        alumno2.enviar("¡Gracias!");
    }
}
