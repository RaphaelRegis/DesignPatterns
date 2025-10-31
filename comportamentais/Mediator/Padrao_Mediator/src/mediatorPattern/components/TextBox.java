package mediatorPattern.components;

import mediatorPattern.mediators.Mediator;

public class TextBox extends Component {

    private String text;

    public TextBox(Mediator mediator) {
        super(mediator);
    }

    public void setText(String text) {
        this.text = text;
        System.out.println("Campo de texto alterado para: " +this.text);
        mediator.notify(this, "textChanged");
    }

    public String getText() {
        return this.text;
    }
}
