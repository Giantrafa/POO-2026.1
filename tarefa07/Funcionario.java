package tarefa07;
//Classe Abistrato, nao pode ser instanciada, so pode ser herdada
//por isso ela e meio generica
public abstract class Funcionario{
    private String nome;
    private double salario;
    
    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }
    public double getSalario() {
        return salario;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public abstract void aumentarSalario();


    public void exibirDados(){
        System.out.println(nome);
        System.out.println(salario);
    }
}