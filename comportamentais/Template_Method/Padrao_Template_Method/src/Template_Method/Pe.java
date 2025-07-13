package Template_Method;

public class Pe extends CaminhoTrabalho {

    @Override
    protected void irAoDestino() {
        System.out.println("Caminhando até o trabalho...");
    }

    @Override
    protected void voltarParaCasa() {
        System.out.println("Caminhando de volta para casa...");
    }
    
}
