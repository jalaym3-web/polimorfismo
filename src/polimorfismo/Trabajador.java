package polimorfismo;

public class Trabajador { //clase padre

	private String nombre;
	private double salario;
	
	public Trabajador(String nombre, double salario) {
		super();
		this.nombre = nombre;
		this.salario = salario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void calcularPago() { // metodo a sobreescribir
		System.out.println("El pago es: "+salario);
	}
}
