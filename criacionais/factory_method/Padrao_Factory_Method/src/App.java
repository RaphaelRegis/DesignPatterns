import Criadores.Restaurante;
import Criadores.RestauranteMacarrao;
import Criadores.RestaurantePizza;

public class App {
    public static void main(String[] args) throws Exception {
        Restaurante macarrao = new RestauranteMacarrao();
        macarrao.pedirRefeicao();

        Restaurante pizza = new RestaurantePizza();
        pizza.pedirRefeicao();
    }
}
