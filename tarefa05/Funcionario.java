package tarefa05;

public class Funcionario {
    private int matricula;
    private String nome;
    
    public Funcionario(int matricula, String nome){
        this.matricula = matricula;
        this.nome = nome;
    }
    //Getters
    public int getmatricula(){
        return matricula;
    }

    public String getnome(){
        return nome;
    }

    //Setters
    public void setmatricula(int matricula){
        this.matricula = matricula;
    }

    public void setnome(String nome){
        this.nome = nome;
    }

    public String toString(){
        return(nome +" "+ matricula);
    }
} 