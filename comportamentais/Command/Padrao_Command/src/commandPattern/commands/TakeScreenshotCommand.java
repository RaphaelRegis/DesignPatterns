package commandPattern.commands;

import commandPattern.receivers.Smartphone;

public class TakeScreenshotCommand implements Command {
    private final Smartphone celular;

    public TakeScreenshotCommand(Smartphone celular) {
        this.celular = celular;
    }

    @Override
    public void execute() {
        celular.takeScreenshot();
    }
}
