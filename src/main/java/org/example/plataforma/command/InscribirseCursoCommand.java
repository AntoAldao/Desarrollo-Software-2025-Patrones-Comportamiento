package org.example.plataforma.command;

public class InscribirseCursoCommand implements Command {
    private final String curso;

    public InscribirseCursoCommand(String curso) {
        this.curso = curso;
    }

    @Override
    public void execute() {
        System.out.println("El alumno se ha inscrito en el curso: " + curso);
    }
}