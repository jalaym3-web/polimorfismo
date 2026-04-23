package polimorfismo;

public class Figura {
	
private double alto, ancho;

public Figura(double alto, double ancho) { //clase padre
	super();
	this.alto = alto;
	this.ancho = ancho;
}

// getters y setters
public double getAlto() {
	return alto;
}

public void setAlto(double alto) {
	this.alto = alto;
}

public double getAncho() {
	return ancho;
}

public void setAncho(double ancho) {
	this.ancho = ancho;
}

public void area() { // metodo a sobreescribir
	double area= ancho*alto;
	System.out.println("El area es de: "+ area);
	
}
}
