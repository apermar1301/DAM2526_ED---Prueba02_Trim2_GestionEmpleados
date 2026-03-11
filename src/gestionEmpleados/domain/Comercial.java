package gestionEmpleados.domain;

public class Comercial extends Empleado {

	private double ventas;

	public Comercial(String dni, String nombre, String apellidos, double sueldoBase) {
		super(dni, nombre, apellidos, sueldoBase);
	}

	public void setVentas(double ventas) {
		this.ventas = ventas;
	}

	@Override
	public double getSueldo() {
		return super.getSueldoBase() + 0.1 * ventas;
	}

}
