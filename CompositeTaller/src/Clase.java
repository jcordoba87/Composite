import java.util.ArrayList;

public class Clase extends Animalia {

	
	private ArrayList<Animalia> animales = new ArrayList<Animalia>();
		
	
	@Override
	public void agregar(Animalia a) {
		animales.add(a);
		
	}

	@Override
	public void getEspecie(Animalia a) {
		for (Animalia a1: animales) {
			getEspecie(a1);
			}
	}
	
	

}
