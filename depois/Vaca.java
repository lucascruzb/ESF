package depois;
public class Vaca extends Animal{
    public Vaca() {
        super("Muuu");
    }
    @Override
    public void ação() {
        System.out.println("vaca comendo pasto");
    }   
}
