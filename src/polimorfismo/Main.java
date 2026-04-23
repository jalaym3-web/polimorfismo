package polimorfismo;

public class Main {
	public static void main(String[] args) {
	
		Animal p = new Perro ("Perro"); // muestra el texto del animal haciendo el sonido
		p.hacerSonido();
		
		Figura r = new Rectangulo (10, 15); //calcula el area de un rectangulo de 10x15
		r.area();
		
		Empleado e = new Vendedor("Jorge"); //muestra el resumen del trabajador llamado Jorge
		e.resumen();
		
		Cuenta c = new CuentaAhorro(500.00); // realiza un deposito de Q.100.00 a una cuenta con Q.500.00
		c.depositar(100);
		
		Transporte transporte = new Avion(); //muestra texto diciendo que el transporte se está moviendo
		transporte.moverse();
		
		Persona persona = new Estudiante("Miguel", 12345, "Ingenieria");// muestra la información del estudiante
		persona.presentarse();
		
		Vehiculo v = new Motocicleta (); //muestra el texto de encender el vehiculo
		v.encender();
		
		Producto prod = new ProductoDigital("Laptop", 8000.0, 512.0); //muestra la descripción del producto y agrega capacidad en la descripcion
		prod.mostrarDescripcion();
		
		Instrumento in = new Guitarra(); // muestra texto del instrumento sonando
		in.tocar();
		
		Trabajador t = new TrabajadorPorHora("Jose", 1000.0, 160, 15.0); // muestra detalles y el total del salario del trabajador
		t.calcularPago();
		
		
	}
	
	
	
	
	
	
}
