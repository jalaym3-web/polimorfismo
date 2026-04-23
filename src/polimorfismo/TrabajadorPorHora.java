package polimorfismo;

public class TrabajadorPorHora extends Trabajador{ //clase hijo hereda de clase Trabajador

	private int horasTrabajadas;
	private double pagoHora;
	// constructor
	public TrabajadorPorHora(String nombre, double salario, int horasTrabajadas, double pagoHora) {
		super(nombre, salario);
		this.horasTrabajadas = horasTrabajadas;
		this.pagoHora = pagoHora;
	}
	
	@Override //metodo sobreescrito que pone el pago por hora y los detalles
	public void calcularPago() {
		double pago = horasTrabajadas * pagoHora;
        System.out.println("Trabajador: " + getNombre());
        System.out.println("Horas trabajadas: " + horasTrabajadas);
        System.out.println("Pago por hora: Q" + pagoHora);
        System.out.println("Pago total: Q" + pago);
	}
	
	
	
	
	
	
}
