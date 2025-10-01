package org.example.plataforma.command;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
    private final List<Command> commandQueue = new ArrayList<>();

    public void addCommand(Command command) {
        commandQueue.add(command);
    }

    public void executeCommands() {
        for (Command command : commandQueue) {
            command.execute();
        }
        commandQueue.clear();
    }
}
