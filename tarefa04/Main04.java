package tarefa04;
//Multiplas Classes em um mesmo arquivo para criar a conta

public class Main04 {
    public static void main(String[] args) {
        Data nacimento = new Data (11,9,2001);
        
        Telefone telefone = new Telefone ("11", "99999-8888");

        Enderesso endereco01 =new Enderesso("Av Brasil",
                123,
                "Centro",
                "São Paulo",
                "SP"
            );
        

        Cliente cli = new Cliente("João Silva",
            "1234567",
            "123.456.789-00",
            telefone, nacimento, endereco01);

            System.out.println(cli);            
    }
}