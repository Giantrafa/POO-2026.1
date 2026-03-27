package RevisaoProva;
import java.util.ArrayList;

public class AplicacaoDev {
    public static void main(String[] args){

        ArrayList <Funcionario> funcionários = new ArrayList<>();

        Gerente g = new Gerente("fulano",1000, "computacao");
        Desenvolvedor d1 = new Desenvolvedor("cicrano", 800, "java");
        Desenvolvedor d2 = new Desenvolvedor("betano", 400, "javascript");

        funcionários.add(g);
        funcionários.add(d1);
        funcionários.add(d2);

        imprime(funcionários);
    }

    public static void imprime (ArrayList <Funcionario> f){
        for(int i=0; i<f.size(); i++){
            System.out.println(f.get(i).getNome());
            System.out.println(f.get(i).getSalsario());
            if(f.get(i) instanceof Gerente){
                System.out.println("bonus "+((Gerente)f.get(i)).calcularBonus());
            } else if(f.get(i) instanceof Desenvolvedor){
                System.out.println("bonus "+((Desenvolvedor)f.get(i)).calcularBonusDev());
            }
            System.out.println("========");
        }
    }
}
//f.forEach(funcionario ->{});

/* Windows: Shift + Alt + A
Linux: Shift + Ctrl + A
macOS: Shift + Option + A */