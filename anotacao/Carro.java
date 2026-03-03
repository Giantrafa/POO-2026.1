package anotacao;

public class Carro {
    String marca;
    String modelo;
    Motor motor; // objeto como tipo — composição

    // construtor completo
    // chama da main e aplica na classe
    public Carro(String marca, String modelo, Motor motor) {
        this.marca  = marca;
        this.modelo = modelo;
        this.motor  = motor;
    }

    // sobrecarga — chama Carro mais de uma vez
    public Carro(String marca, String modelo) {
        this(marca, modelo, null);
    }

    //toString() - no int ele iria mostra o numero e onde esta localisado na memoria
    // agora ele so mostra o numero
    public String toString() {
        return "Marca: "  + marca  +
            "\nModelo: " + modelo +
            "\nMotor: "  + motor;
    }
}