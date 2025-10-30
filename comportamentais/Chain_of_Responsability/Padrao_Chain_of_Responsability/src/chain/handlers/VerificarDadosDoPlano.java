package chain.handlers;

public class VerificarDadosDoPlano extends Handler {

    @Override
    public boolean handle(String problema) {

        if (problema.equals("VerificarDadosDoPlano")) {
            System.out.println("Problema: " + problema + " | RESOLVIDO");
            return true;
        }

        System.out.println("Passando para o próximo handler...");
        return handleNext(problema);
    }
}
