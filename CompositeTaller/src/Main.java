
public class Main {

	public static void main(String[] args) {
		
	Animalia animal = new Clase();		
		
	Especie leon = new Especie ("leo" , "felis", "felidae", "carnivora", "mamal", "chordate", "leon");
	Especie humano = new Especie ("sapiens" , "homo", "hominidae", "primate", "Mammal", "chordate", "Humano");
		
	animal.getEspecie(leon);
		
	
	System.out.println(leon.getOrden());
	System.out.println(leon.getNombre());
	System.out.println(leon.getGenero());
	System.out.println(leon.getFilo());
	System.out.println(leon.getFamilia());
	System.out.println(leon.getEspecie());
	System.out.println(leon.getClase());
	

	}

}
