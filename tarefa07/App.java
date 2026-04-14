package tarefa07;
//Abstrato com Herança
public class App {
    public static void main(String[] args) {
        Funcionario g1 = new Gerente("Joao", 5000);
        Funcionario p1 = new Programador("Maria", 3000);
        
        //como ambos herdam de Funcionario, ambos tem o mesmo metodo 
        //que sera implementado de formas diferentes, isso e o polimorfismo
        g1.aumentarSalario();
        p1.aumentarSalario();
        
        g1.exibirDados();
        p1.exibirDados();
    }
}