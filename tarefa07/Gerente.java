package tarefa07;

public class Gerente extends Funcionario{
    
    public Gerente(String nome, double salario){
        super(nome, salario);
    }
    
    public void aumentarSalario(){
        setSalario(getSalario()*0.20);
    }
}