package commandPattern.commands;

import commandPattern.receivers.Smartphone;

public class LowerVolumeCommand implements Command {
    private final Smartphone celular;

    public LowerVolumeCommand(Smartphone celular) {
        this.celular = celular;
    }

    @Override
    public void execute() {
        celular.lowerVolume();
    }
}
