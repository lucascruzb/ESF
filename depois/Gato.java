package depois;
public class Gato extends Animal {
    public Gato() {
        super("Miau");
    }
    @Override
    public void ação() {
        System.out.println("Ignorando todo mundo");
    }
    
}
