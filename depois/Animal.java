package depois;
public class Animal implements domesticar {
    private String som;
	public Animal(String som) {
        this.som = som;
        }
    @Override
	public void emitirSom() {
	    System.out.println(getClass().getName() + " faz " + som);
        }
    @Override
    public void ação() {
        return;
    }
}
