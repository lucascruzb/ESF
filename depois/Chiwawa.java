package depois;
public class Chiwawa extends Cao {
    @Override
	public void emitirSom() {
	    System.out.println(getClass().getName() + " faz " + "Sou um chiwawa e não tenho latido legal");
    }
    @Override
    public void ação() {
        System.out.println("tremendo sem parar");
    }
}
