import prototype.Veiculo;
import prototype.VeiculoCache;

public class App {
    public static void main(String[] args) throws Exception {

        VeiculoCache.loadCache();
        Veiculo veiculo1 = VeiculoCache.getVeiculoCopy(1);
        Veiculo veiculo2 = VeiculoCache.getVeiculoCopy(2);

        veiculo1.Dirigir();
        veiculo2.Dirigir();
         
    }
}
