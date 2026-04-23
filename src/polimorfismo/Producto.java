package polimorfismo;

public class Producto { //clase padre

	private String nombre;
	private double precio;
	
	public Producto(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}
		
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}



	public void mostrarDescripcion() { //metodo a sobreescribir
		System.out.println("Nombre del producto: " + nombre);
		System.out.println("Precio del producto: Q." + precio);
	}
}
