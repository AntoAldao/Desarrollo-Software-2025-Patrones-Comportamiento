package org.example.plataforma.command;

public class AbandonarCursoCommand implements Command {
    private final String curso;

    public AbandonarCursoCommand(String curso) {
        this.curso = curso;
    }

    @Override
    public void execute() {
        System.out.println("El alumno ha abandonado el curso: " + curso);
    }
}