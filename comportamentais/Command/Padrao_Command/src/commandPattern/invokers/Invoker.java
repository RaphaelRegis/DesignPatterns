package commandPattern.invokers;

import commandPattern.commands.Command;

public abstract class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        if (this.command != null) {
            this.command.execute();
        }
    }
}
