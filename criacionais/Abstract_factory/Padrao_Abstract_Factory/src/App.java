import Fabricas.Restaurante;
import Fabricas.RestauranteItaliano;
import Fabricas.RestauranteRusso;
import Produtos.Comidas.Comida;
import Produtos.Bebidas.Bebida;

public class App {
    public static void main(String[] args) throws Exception {
        
        Restaurante restauranteItaliano = new RestauranteItaliano();
        Comida pizza = restauranteItaliano.prepararComida();
        Bebida cappuccino = restauranteItaliano.prepararBebida();

        pizza.comer();
        cappuccino.beber();

        Restaurante restauranteRusso = new RestauranteRusso();
        Comida strogonoff = restauranteRusso.prepararComida();
        Bebida vodka = restauranteRusso.prepararBebida();

        strogonoff.comer();
        vodka.beber();
    }
}
