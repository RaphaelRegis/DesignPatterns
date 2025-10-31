package mediatorPattern.mediators;

import mediatorPattern.components.Button;
import mediatorPattern.components.Component;
import mediatorPattern.components.TextBox;

public class LoginDialog implements Mediator {

    private TextBox usernameField;
    private TextBox passwordField;
    private Button loginButton;

    public LoginDialog() {
        this.usernameField = new TextBox(this);
        this.passwordField = new TextBox(this);
        this.loginButton = new Button(this);
    }

    public Button getLoginButton() {
        return loginButton;
    }

    public TextBox getUsernameField() {
        return usernameField;
    }

    public TextBox getPasswordField() {
        return passwordField;
    }

    @Override
    public void notify(Component sender, String event) {
        if (event.equals("textChanged")) {
            checkFields();
        } else if (event.equals("click")){
            login();
        }
    }

    private void checkFields() {
        boolean enable = false;

        if (usernameField.getText() != null && passwordField.getText() != null) {

            if (!usernameField.getText().isEmpty() && !passwordField.getText().isEmpty()) {
                enable = true;
            }
        }



        loginButton.setEnabled(enable);
    }

    private void login() {
        System.out.println("Tentando fazer login com usuário: " + usernameField.getText());
    }
}
