package mediatorPattern.mediators;

import mediatorPattern.components.Component;

public interface Mediator {
    void notify(Component sender, String event);

}
