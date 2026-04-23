package polimorfismo;

public class Cuenta { //clase padre

	private double saldo;

	public Cuenta(double saldo) {
		super();
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(double monto) { //metodo a sobreescribir
		saldo += monto; 
		System.out.println("El deposito ha sido realizado \nEl deposito es de:"+ monto);
		System.out.println("\nEl saldo actual es de:"+ saldo);
	}
}
