package tarefa06;

public class Main06 {
    public static void main(String[] args) {
         PessoaFisica p1 = new PessoaFisica("Carlos", 25, "123.456.789-00");

        System.out.println(p1.getNome());
        System.out.println(p1.getIdade());
        System.out.println(p1.getCpf());

        p1.setNome("João");
        p1.setIdade(30);
        p1.setCpf("999.999.999-99");

        System.out.println("Novo nome: " + p1.getNome());
        System.out.println("Nova idade: " + p1.getIdade());
        System.out.println("Novo CPF: " + p1.getCpf());
        
    }
}
