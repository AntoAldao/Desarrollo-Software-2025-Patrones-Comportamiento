package org.example.plataforma.command;

public class SolicitarCertificadoCommand implements Command {
    private final String curso;

    public SolicitarCertificadoCommand(String curso) {
        this.curso = curso;
    }

    @Override
    public void execute() {
        System.out.println("Se ha solicitado el certificado del curso: " + curso);
    }
}