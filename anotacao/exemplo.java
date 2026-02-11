package anotacao;

public class exemplo {
    public static void main(String[] args){
        //cria um ojeto em java
        Aluno aluno = new Aluno();
        
        //cria tambem um objeto mas ele muda o paremetro anoColegio
        Aluno aluno2 = new Aluno(7);
        

        System.out.println(aluno.anoColegio);
        System.out.println(aluno2.anoColegio);
        
        //permite q o constructor volte com a resposta
        //System.out.println(aluno.somaidade());
    }
}
