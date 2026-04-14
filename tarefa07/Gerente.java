package tarefa07;
//Herda tudo de Funcionario, e tem que implementar o metodo abstrato aumentarSalario
public class Gerente extends Funcionario{
    
    public Gerente(String nome, double salario){
        super(nome, salario);
    }
    
    public void aumentarSalario(){
        setSalario(getSalario()*0.20);
    }
}