package polimorfismo;

public class Animal { // clase Padre

	private String nombre;

	public Animal(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	public void hacerSonido() {
		System.out.println("El animal hace: "); // metodo que se va a sobreescribir
		}
}
