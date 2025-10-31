import memento_pattern.caretaker.History;
import memento_pattern.originator.Editor;

public class Main {
    public static void main(String[] args) {
        History history = new History();

        // define as diferentes versoes do texto
        System.out.println("========= Evolução do texto =========");
        history.save("Versão 1");
        System.out.print("1ª versão: ");
        history.printText();

        history.save("Versão 2");
        System.out.print("2ª versão: ");
        history.printText();

        history.save("Versão 3");
        System.out.print("3ª versão: ");
        history.printText();

        // restaura as versoes anteriores
        System.out.println("\n========= Rollback das versões anteriores =========");
        System.out.print("Versão atual: ");
        history.printText();

        for(int i=0; i<3; i++) {
            history.undo();
            System.out.print("Após desfazer: ");
            history.printText();
        }


    }
}