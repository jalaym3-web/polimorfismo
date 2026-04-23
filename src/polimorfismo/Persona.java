package polimorfismo;

public class Persona { // clase padre

private String nombre;



	public Persona(String nombre) {
	super();
	this.nombre = nombre;
}

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void presentarse() { //metodo a sobreescribir
		System.out.println("Mi nombre es " + nombre);
	}
}
