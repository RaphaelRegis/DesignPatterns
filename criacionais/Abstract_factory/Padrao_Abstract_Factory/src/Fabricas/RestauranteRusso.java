package Fabricas;

import Produtos.Bebidas.Bebida;
import Produtos.Bebidas.Vodka;
import Produtos.Comidas.Comida;
import Produtos.Comidas.Strogonoff;

// Representa uma fabrica concreta
public class RestauranteRusso implements Restaurante {

    @Override
    public Comida prepararComida() {
        return new Strogonoff();
    }

    @Override
    public Bebida prepararBebida() {
        return new Vodka();
    }
    
}
