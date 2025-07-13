package Fabricas;

import Produtos.Bebidas.Bebida;
import Produtos.Comidas.Comida;

// representa a fabrica abstrata
public interface Restaurante {
    public Comida prepararComida();
    public Bebida prepararBebida();
}
