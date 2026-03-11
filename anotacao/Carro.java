package anotacao;

public class Carro{
    
    private String marca;
    private String modelo;
    // aqui eu chamo |Motor| como se fosse um gasolina, onde pegara os atributos q foram impostos nele
    private Motor motor;               
    

    public Carro(String marca, String modelo, Motor motor) {
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

    public Motor getMotor() {
        return motor;
    }
    
    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public String toString() {        
        return "Marca: " + marca +
               "\nModelo: " + modelo +
               "\nMotor -" + motor;
    }
}