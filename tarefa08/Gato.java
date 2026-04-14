package tarefa08;

public class Gato implements Animal {

    @Override
    //quando e interface  o "Override" é obrigatorio para sobre escrever o metodo da interface
    //mesmo q nessa situaçao nao seria necessario
    public void eat() {
        System.out.println("O gato está comendo.");
    }

    @Override
    public void sleep() {
        System.out.println("O gato está dormindo.");
    }
}