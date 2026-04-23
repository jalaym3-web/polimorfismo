package polimorfismo;

public class Rectangulo extends Figura{ //se aplica la herencia 

	public Rectangulo(double alto, double ancho) {
		super(alto, ancho);
	}

	@Override //metodo que se sobreescribe
	public void area() {
		super.area();
	}



	

	
}
