package tarefa01;

public class Main{
    public static void main (String[] args){
        Quadrado r = new Quadrado(4);
        
        for(int i = 0; i < r.lado; i++){
            for(int j = 0; j < r.lado; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
