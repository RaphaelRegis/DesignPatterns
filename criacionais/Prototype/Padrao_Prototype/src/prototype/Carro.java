package prototype;

public class Carro extends Veiculo {

    public Carro(String modelo) {
        super(modelo);
    }

    @Override
    public void Dirigir() {
        System.out.println("Dirigindo o carro modelo " + this.modelo);
    }
    
}
