package polimorfismo;

public class Empleado { //clase padre

	private String nombre;

	public Empleado(String nombre) {
		super();
		this.nombre = nombre;
	}
	
 // getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void resumen() { //metodo a sobreescribir
		System.out.println("Resumen de Empleado\n Nombre: " + nombre);
	}
}
