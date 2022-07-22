package antes;
public class Gato extends Animal {
    public Gato() {
        super("miau");
        }
    public void emitirSom() {
        System.out.println("O gato, enquanto anda sorrateiramente na noite");
        System.out.println("---------------------");
        super.emitirSom();
        System.out.println("---------------------");
        }
}
