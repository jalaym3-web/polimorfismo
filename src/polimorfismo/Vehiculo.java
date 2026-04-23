package polimorfismo;

public class Vehiculo { //clase padre

	public Vehiculo() {
		super();
	}

	public void encender() { //metodo que se va a sobreescribir
		System.out.println("El vehiculo se está encendiendo...");
	}
}
