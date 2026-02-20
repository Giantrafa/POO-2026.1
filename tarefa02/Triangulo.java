package tarefa02;

public class Triangulo {
    int lado1, lado2, lado3;

    // equilatero
    Triangulo(int a){
        this.lado1 = a;
        this.lado2 = a;
        this.lado3 = a;
    }

    // isosceles
    Triangulo(int a, int b) {
        this.lado1 = a;
        this.lado2 = a;           
        this.lado3 = b;
    }

    // escaleno
    Triangulo(int a, int b, int c){
        this.lado1 = a;
        this.lado2 = b;
        this.lado3 = c;
    }

    int Perimetro(){
        return lado1 + lado2 + lado3;
    }

    String idTriangulo(){
        if(lado1 == lado2 && lado2 == lado3){
            return "Equilatero";
        }
        else if(lado1 != lado2 && lado1 != lado3 && lado2 != lado3){
            return "Escaleno";
        }
        else{
            return "Isosceles";
        }
    }
    
    void exibe (){
        System.out.println("Lados: " + lado1 + ", " + lado2 + ", " + lado3);
        System.out.println("Perimetro: " + Perimetro());
        System.out.println("Tipo: " + idTriangulo());
    }
}