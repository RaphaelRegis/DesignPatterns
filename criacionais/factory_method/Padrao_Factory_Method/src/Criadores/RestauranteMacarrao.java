package Criadores;

import Produtos.Macarrao;
import Produtos.Refeicao;

public class RestauranteMacarrao extends Restaurante {

    @Override
    public Refeicao criarRefeicao() {
        return new Macarrao();
    }
    
}
