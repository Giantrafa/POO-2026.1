package anotacao.teste;
import java.util.Scanner;

public class Senha {    
    private static final Scanner SCANNER = new Scanner(System.in);

    private String senha = "12345";
    private int[] chanse;  
    public int maxChances = 10;
    public int test = 0;

    public Senha(String senha, int maxChances) {
        this.senha = senha;
        this.maxChances = maxChances;
        this.chanse = new int[maxChances];
    }


    public int tentar(){
        System.out.print("Qual é a senha?");
        String input = SCANNER.nextLine();

        if (input.equals(senha)){
            System.out.println("acertou");
            return 1;
        }
        else{
            System.out.println("errou");
            return test ++;
        }
    }



    public int validar() {
        if(test == maxChances){
             System.out.println("acabou as chanses");
            return 0;
        }
        else{
            return test;
        }
    }    
}