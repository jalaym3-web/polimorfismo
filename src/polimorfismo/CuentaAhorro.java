package polimorfismo;

public class CuentaAhorro extends Cuenta{ // se aplica la herencia a la clase hijo

	public CuentaAhorro(double saldo) {
		super(saldo);
	}

	@Override
	public void depositar(double monto) { //metodo sobreescrito
	    double interes = monto * 0.2;
	    setSaldo(getSaldo() + monto + interes);
	    System.out.println("El deposito ha sido realizado \nEl deposito es de:"+ monto);
	    System.out.println("\nEl interes es de:"+ interes);
		System.out.println("\nEl saldo actual es de:"+ getSaldo());
	}


	

}
