package chain.handlers;

public class AssinarNovoPlano extends Handler {

    @Override
    public boolean handle(String problema) {

        if (problema.equals("AssinarNovoPlano")) {
            System.out.println("Problema: " + problema + " | RESOLVIDO");
            return true;
        }

        System.out.println("Passando para o próximo handler...");
        return handleNext(problema);
    }
}
