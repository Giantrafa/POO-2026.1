package tarefa05;

public class Departamento {
    private int codigo;
    private String nome;

    public Departamento(int codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
    }

    public int getcodigo(){
        return codigo;
    }

    public String getnome(){
        return nome;
    }

    public void setmatricula(int codigo){
        this.codigo = codigo;
    }

    public void setnome(String nome){
        this.nome = nome;
    }

    public String toString(){
        return(nome + codigo);
    }
} 