package polimorfismo;

public class Guitarra extends Instrumento{ // clase hija hereda de Instrumento

	public Guitarra() {
		super();
	}

	@Override //se sobreescribe el metodo
	public void tocar() {
		System.out.println("La guitarra suena.. ");
	}

	
}
