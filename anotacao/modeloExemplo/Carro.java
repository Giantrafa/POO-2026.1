package anotacao.modeloExemplo;

// Carro usa interface e composição (tem um motor)
public class Carro implements Veiculo {

    private String marca;
    private String modelo;
    private VeiculoBase motor; // POLIMORFISMO AQUI

    public Carro(String marca, String modelo, VeiculoBase motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public VeiculoBase getMotor() {
        return motor;
    }

    public void setMotor(VeiculoBase motor) {
        this.motor = motor;
    }

    @Override
    public void ligar() {
        System.out.println("Carro ligado!");        
    }

    @Override
    public String toString() {
        return "Marca: " + marca +
               "\nModelo: " + modelo +
               "\n" + motor;
    }
}