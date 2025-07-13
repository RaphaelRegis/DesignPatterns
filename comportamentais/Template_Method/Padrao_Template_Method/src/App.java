import Template_Method.CaminhoTrabalho;
import Template_Method.Carro;
import Template_Method.Pe;

public class App {
    public static void main(String[] args) throws Exception {
        CaminhoTrabalho caminhoCarro = new Carro();
        CaminhoTrabalho caminhoPe = new Pe();

        caminhoCarro.irAoTrabalho();
        System.out.println();
        caminhoPe.irAoTrabalho();
    }
}
