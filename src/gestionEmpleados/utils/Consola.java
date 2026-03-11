package gestionEmpleados.utils;

import java.util.Scanner;

public class Consola implements IEntradaSalida {

	private Scanner scanner = new Scanner(System.in);

	@Override
	public void imprimir(String texto) {

		System.out.print(texto);

	}

	@Override
	public void imprimirLinea(String texto) {
		System.out.println(texto);

	}

	@Override
	public String leerTexto(String mensaje) {
		System.out.printf("%s: ", mensaje);
		return scanner.nextLine();
	}

	@Override
	public int leerEntero(String mensaje) {
		System.out.printf("%s: ", mensaje);
		return scanner.nextInt();
	}

	@Override
	public double leerImporte(String mensaje) {
		System.out.printf("%s: ", mensaje);
		return scanner.nextDouble();
	}

	@Override
	public void mostrarMenu() {

		System.out.println("1 - Contratar empleado");
		System.out.println("2 - Listar todos los empleados");
		System.out.println("3 - Listar empleados con filtro");
		System.out.println("4 - Salir");

	}

	@Override
	public void limpiarPantalla() {

		for (int i = 0; i < 100; i++) {
			System.out.println();
		}

	}

	@Override
	public void pausa() {
		System.out.println("\nPulse enter para continuar...");
		scanner.next();
	}

}
