package Criadores;

import Produtos.Pizza;
import Produtos.Refeicao;

public class RestaurantePizza extends Restaurante {

    @Override
    public Refeicao criarRefeicao() {
        return new Pizza();
    }
    
}
