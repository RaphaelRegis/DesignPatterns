package Template_Method;

public abstract class CaminhoTrabalho {
    public final void irAoTrabalho() {
        sairDeCasa();
        irAoDestino();
        chegarAoTrabalho();
        voltarParaCasa();
    }

    protected abstract void irAoDestino();
    protected abstract void voltarParaCasa();

    private void sairDeCasa() {
        System.out.println("Saindo de casa para o trabalho...");
    }

    private void chegarAoTrabalho() {
        System.out.println("Chegando ao trabalho...");
    }


}
