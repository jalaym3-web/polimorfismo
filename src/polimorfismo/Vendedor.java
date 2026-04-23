package polimorfismo;

public class Vendedor extends Empleado{ //se aplica la herencia

	public Vendedor(String nombre) {
		super(nombre);
	}
	
	@Override
	public void resumen() { //metodo sobreescrito
		System.out.println("Resumen de Empleado\n Puesto: Vendedor\n Nombre: "+getNombre());
	}
	

}