package tarefa07;

public class Programador extends Funcionario{    

    public Programador(String nome, double salario){
        super(nome, salario);        
    }
        
    public void aumentarSalario(){
        setSalario(getSalario()*1.2);
    }
}