package antes;
public class Animal {
    private String som;
	public Animal(String som) {
        this.som = som;
        }
	public void emitirSom() {
	    System.out.println(getClass().getName() + " faz " + som);
        }
   }
