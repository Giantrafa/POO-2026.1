package provaTest;

public class Gerente extends Funcionario {
    private String departamento;

    public Gerente(String nome, double salario, String departamento){
        super(nome, salario);
        this.departamento = departamento;
    }
    
    public String getDepartamento() {
        return departamento;
    }
    
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    //puxa o getNome da classe Mãe
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

    
    //olhar
    public double calcularBonusGerente (){
        return super.getSalsario()*0.20;
    }
}
