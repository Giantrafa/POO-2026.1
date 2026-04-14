package tarefa07;
//Herda tudo de Funcionario, e tem que implementar o metodo abstrato aumentarSalario

public class Programador extends Funcionario{    
    
    public Programador(String nome, double salario){
        super(nome, salario);        
    }
        
    public void aumentarSalario(){
        setSalario(getSalario()*1.2);
    }
}