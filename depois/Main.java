package depois;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
 
 public class Main {
    public static void main(String[] arguments) {
 	    List<domesticar> animais = new ArrayList<domesticar>();
        Random r = new Random();
        Date d = new Date();
		r.setSeed(d.getTime());
		final int TOTAL = 10;
		for (int i = 0; i < TOTAL; i++) {
			int tipo = r.nextInt(4);
			switch (tipo) {
			case 0:
				animais.add(new Cao());
				break;
			case 1:
				animais.add(new Gato());
				break;
			case 2:
				animais.add(new Vaca());
				break;
			case 3:
				animais.add(new Chiwawa());
				break;
			}
		}
		for (domesticar animal : animais) {
			animal.emitirSom();
            animal.ação();
		}
	}
}