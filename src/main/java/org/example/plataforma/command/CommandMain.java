package org.example.plataforma.command;

import org.example.plataforma.chainofresponsibility.*;

public class CommandMain {
    public static void run()  {
        System.out.println("\n--- INICIO COMMAND ---");

        Invoker invoker = new Invoker();

        Command inscribirse = new InscribirseCursoCommand("Matemáticas");
        Command abandonar = new AbandonarCursoCommand("Historia");
        Command solicitarCertificado = new SolicitarCertificadoCommand("Física");

        invoker.addCommand(inscribirse);
        invoker.addCommand(abandonar);
        invoker.addCommand(solicitarCertificado);

        invoker.executeCommands();
        System.out.println("=== FIN COMMAND === \n\n" );
    }
}
