import commandPattern.commands.Command;
import commandPattern.commands.IncreaseVolumeCommand;
import commandPattern.commands.TakeScreenshotCommand;
import commandPattern.commands.LowerVolumeCommand;
import commandPattern.invokers.Invoker;
import commandPattern.invokers.SmartphoneSystem;
import commandPattern.receivers.Smartphone;

public class Main {
    public static void main(String[] args) {

        // primeiro o invoker
        Invoker smartphoneSystem = new SmartphoneSystem();

        // depois o receiver
        Smartphone smartphone = new Smartphone();

        // em seguida os comandos
        Command increaseVolume = new IncreaseVolumeCommand(smartphone);
        Command lowerVolume = new LowerVolumeCommand(smartphone);
        Command takeScreenshot = new TakeScreenshotCommand(smartphone);

        // agora eh soh chamar os comandos
        smartphoneSystem.setCommand(increaseVolume);
        smartphoneSystem.executeCommand();

        smartphoneSystem.setCommand(lowerVolume);
        smartphoneSystem.executeCommand();

        smartphoneSystem.setCommand(takeScreenshot);
        smartphoneSystem.executeCommand();

    }
}