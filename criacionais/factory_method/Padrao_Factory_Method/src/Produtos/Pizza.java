package Produtos;

public class Pizza implements Refeicao {

    @Override
    public void preparar() {
        System.out.println("Preparando pizza...");
    }
    
}
