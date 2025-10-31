import mediatorPattern.mediators.LoginDialog;

public class Main {
    public static void main(String[] args) {

        LoginDialog dialog = new LoginDialog();

        // simula a interacao do usuario
        dialog.getUsernameField().setText("joao");
        dialog.getPasswordField().setText("1234");

        // agora o botao deve estar habilitado
        dialog.getLoginButton().click();

    }
}