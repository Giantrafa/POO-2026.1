package provaTest;

public class Desenvolvedor extends Funcionario{
     private String linguagem;

    public Desenvolvedor(String nome, double salario, String linguagem ){
        super(nome, salario);
        this.linguagem = linguagem ;
    }
    
    public String getlinguagem() {
        return linguagem;
    }
    
    public void setlinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    
    public String getNome() {
        return super.getNome();
    }

    public double getSalsario() {
        return super.getSalsario();
    }

    
    public String getId() {
        return super.getId();
    }
    


    public void setNome(String nome) {
        super.setNome(nome);
    }

    public void setSalario(double salario) {
        super.setSalario(salario);
    }

    
    
    public double calcularBonusDev (){
        return super.getSalsario()*0.15;
    }
}