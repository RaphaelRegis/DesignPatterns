package prototype;

public class Caminhao extends Veiculo{
    
    public Caminhao(String modelo) {
        super(modelo);
    }

    @Override
    public void Dirigir() {
        System.out.println("Dirigindo o caminhao modelo " + this.modelo);
    }

}
