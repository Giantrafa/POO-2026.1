package tarefa01;
public class Quadrado{
    int lado;

    
    Quadrado(){
        lado = 0;
    }
    Quadrado(int lado){
        this.lado = lado;
    }


    double area(){
        return lado * lado;
    }

    double comprimento(){
        return 4 * this.lado;        
    }
}