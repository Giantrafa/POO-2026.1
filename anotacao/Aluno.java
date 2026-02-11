package anotacao;

public class Aluno {
    String nome;
    int idade;
    int anoColegio;

    // Construtor padrão: define o anoColegio com valor base 5
    public Aluno(){
        anoColegio = 5;
    }
    
    // Construtor com parâmetro: permite definir anoColegio ao criar o objeto
    // 'this.anoColegio' se refere ao atributo da instância
    // e recebe o valor passado no parâmetro x
    public Aluno(int x){
         this.anoColegio = x;
    }
    
    // Sobrecarga de construtor:
    // existem dois construtores com o mesmo nome da classe (Aluno),
    // mas com parâmetros diferentes, permitindo diferentes formas de criar objetos
    /*
    int somaidade(){
        return idade+idade;
    }
    */
    

}