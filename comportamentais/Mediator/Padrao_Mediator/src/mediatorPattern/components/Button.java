package mediatorPattern.components;

import mediatorPattern.mediators.Mediator;

public class Button extends Component {
    private boolean enabled = false;

    public Button(Mediator mediator) {
        super(mediator);
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
        System.out.println("Botão agora está " + (enabled ? "habilidado" : "desabilitado"));
    }
    
    public boolean isEnabled() {
        return enabled;
    }

    public void click(){
        if (enabled) {
            mediator.notify(this, "click");
        } else {
            System.out.println("Botão desabilitado!");
        }
    }
}
