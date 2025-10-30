import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> carros = new ArrayList<>();
        carros.add("Volkswagen Gol");
        carros.add("Chevrolet Classic");
        carros.add("Fiat Mobi");
        carros.add("Chevrolet Onix");
        carros.add("Fiat 500");
        carros.add("Volkswagen Voyage");

        Iterator<String> iterator = carros.iterator();

        while (iterator.hasNext()) {
            String carro = iterator.next();
            System.out.println(carro);
        }


    }
}