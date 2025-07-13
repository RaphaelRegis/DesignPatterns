package Fabricas;

import Produtos.Bebidas.Bebida;
import Produtos.Bebidas.Cappuccino;
import Produtos.Comidas.Comida;
import Produtos.Comidas.Pizza;

// Representa uma fabrica concreta
public class RestauranteItaliano implements Restaurante {

    @Override
    public Comida prepararComida() {
        return new Pizza();
    }

    @Override
    public Bebida prepararBebida() {
        return new Cappuccino();
    }
    
}
