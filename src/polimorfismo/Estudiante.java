package polimorfismo;

public class Estudiante extends Persona{ //clase hijo y se extiende de Persona
	
	private int carnet;
	private String carrera;
	
	public Estudiante(String nombre, int carnet, String carrera) {
		super(nombre);
		this.carnet = carnet;
		this.carrera = carrera;
	}

	@Override
	public void presentarse() { // metodo sobreescrito
		super.presentarse();
		System.out.println("Y mi carnet es " + carnet);
		System.out.println("Y mi carrera es " + carrera);
	}



	
}
