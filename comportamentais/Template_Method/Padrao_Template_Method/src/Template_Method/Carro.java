package Template_Method;

public class Carro extends CaminhoTrabalho {

    @Override
    protected void irAoDestino() {
        System.out.println("Dirigindo até o trabalho...");
    }

    @Override
    protected void voltarParaCasa() {
        System.out.println("Voltando pra casa de carro...");
    }
    
}
