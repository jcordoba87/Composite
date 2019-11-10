
public class Especie extends Animalia{

	
	private String filo;
	private String clase;
	private String orden;
	private String familia;
	private String genero;
	private String especie;
	private String nombre;
	
	
	
	public Especie(String filo, String clase, String orden, String familia, String genero, String especie,
			String nombre) {
		super();
		this.filo = filo;
		this.clase = clase;
		this.orden = orden;
		this.familia = familia;
		this.genero = genero;
		this.especie = especie;
		this.nombre = nombre;
	}

	public String getFilo() {
		return filo;
	}

	public void setFilo(String filo) {
		this.filo = filo;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	public String getOrden() {
		return orden;
	}

	public void setOrden(String orden) {
		this.orden = orden;
	}

	public String getFamilia() {
		return familia;
	}

	public void setFamilia(String familia) {
		this.familia = familia;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public void getEspecie(Animalia a) {
		// TODO Auto-generated method stub
		return;
	}

		
	
}