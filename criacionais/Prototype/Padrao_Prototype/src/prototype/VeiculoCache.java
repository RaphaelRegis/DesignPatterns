package prototype;

import java.util.HashMap;
import java.util.Map;

public class VeiculoCache {
    
    private final static Map<Integer, Veiculo> veiculoMap = new HashMap<>();

    public static Veiculo getVeiculoCopy(Integer id) {
        Veiculo veiculoCacheado = veiculoMap.get(id);
        return (Veiculo) veiculoCacheado;
    }

    public static void loadCache() {
        Veiculo veiculo1 = new Carro("Chevrolet Classic");
        Veiculo veiculo2 = new Caminhao("Mercedes 1113");
        
        veiculoMap.put(1, veiculo1);
        veiculoMap.put(2, veiculo2);
    }




}
