package tarefa08;

public class Cao implements Animal {

    @Override
    // esta sobre escrevendo o metodo eat() da interface Animal 
    public void eat() {
        System.out.println("O cão está comendo.");
    }

    @Override
    public void sleep() {
        System.out.println("O cão está dormindo.");
    }
}