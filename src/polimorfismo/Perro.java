package polimorfismo;

public class Perro extends Animal{ // se aplica la herencia en la clase

	public Perro(String nombre) { 
		super(nombre);
	}

	@Override // metodo sobreescrito
	public void hacerSonido() {
		System.out.println(getNombre() + " dice: ¡Guau guau!");
	}
	

}