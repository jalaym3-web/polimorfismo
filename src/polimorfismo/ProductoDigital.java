package polimorfismo;

public class ProductoDigital extends Producto{ //clase hijo hereda de Producto

	private double capacidad;

	public ProductoDigital(String nombre, double precio, double capacidad) {
		super(nombre, precio);
		this.capacidad = capacidad;
	}

	@Override //metodo sobreescrito
	public void mostrarDescripcion() {
		super.mostrarDescripcion();
		System.out.println("La capacidad del producto es: " + capacidad);
	}
	
	
	
	

	
	
}
