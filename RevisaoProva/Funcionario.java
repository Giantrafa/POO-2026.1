package RevisaoProva;
import java.util.*;

public class Funcionario {
    UUID uniqueID = UUID.randomUUID();

    private String nome;
    private double salario;
    private static int totalFuncionarios = 0; // lembrar estatic
    private final String id;


    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        // Gera ID único automaticamente
        id = UUID.randomUUID().toString();
        totalFuncionarios++;
    }

    public String getNome(){
        return nome;
    }

    public double getSalsario(){
        return salario;
    }

    public String getId(){ 
        return id;
    }


    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    public double calcularBonus(){
        return  this.salario * 0.15; 
    }
}
