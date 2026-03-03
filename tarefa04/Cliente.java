package tarefa04;

public class Cliente {
    String nome;
    String rg;
    String cpf;
    Telefone tel;
    Data dtNacimento;
    Enderesso end;

    public Cliente(String nome, String rg, String cpf, Telefone tel, Data dtNacimento, Enderesso end){
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.tel = tel;
        this.dtNacimento = dtNacimento;
        this.end = end;
    }

     public String toString() {
        return "Nome: " + nome +
               "\nRG: " + rg +
               "\nCPF: " + cpf +
               "\nData de Nascimento: " + dtNacimento +
               "\nTelefones: " + tel +
               "\nEndereços: " + end;
    }
}