package commandPattern.commands;

import commandPattern.receivers.Smartphone;

public class IncreaseVolumeCommand implements Command {
    private final Smartphone celular;

    public IncreaseVolumeCommand(Smartphone celular) {
        this.celular = celular;
    }

    @Override
    public void execute() {
        celular.increaseVolume();
    }
}
