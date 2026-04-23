package polimorfismo;

public class Motocicleta extends Vehiculo{ // clase hijo se extiende de Vehiculo

	public Motocicleta() {
		super();
	}

	@Override //metodo sobreescrito
	public void encender() {
		super.encender();
	}
	
}
