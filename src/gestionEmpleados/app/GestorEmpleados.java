package gestionEmpleados.app;

import java.util.List;
import java.util.Scanner;

import gestionEmpleados.domain.Comercial;
import gestionEmpleados.domain.Empleado;
import gestionEmpleados.domain.Plantilla;
import gestionEmpleados.domain.Tecnico;
import gestionEmpleados.utils.IEntradaSalida;

public class GestorEmpleados {

	private Plantilla plantilla;
	private IEntradaSalida consola;

	public GestorEmpleados(Plantilla plantilla, IEntradaSalida consola) {
		this.consola = consola;
		this.plantilla = plantilla;
	}

	public void ejecutar() {
		Scanner sc = new Scanner(System.in);

		int opcion = 0;
		boolean ok = true;
		do {
			consola.mostrarMenu();
			System.out.print("\n> ");
			opcion = sc.nextInt();

			switch (opcion) {
			case 1 -> contratarEmpleado();
			case 2 -> contratarEmpleado();
			case 3 -> listarPorFiltro();
			case 4 -> {
				System.out.println("\n\tADIOS!!!");
				ok = false;
			}
			}

		} while (ok);

	}

	public void contratarEmpleado() {
		Scanner sc = new Scanner(System.in);

		// Datos Empleados
		String dni;
		String nombre;
		String apellidos;
		double sueldoBase;
		int categoria;

		int opcion = 0;
		boolean ok = true;
		do {
			System.out.println("1 - Técnico\n" + "\n2 - Comercial");
			System.out.printf("\n> ");
			opcion = sc.nextInt();

			switch (opcion) {
			case 1 -> {
				System.out.print("\n\nDNI> ");
				dni = sc.nextLine();
				sc.nextInt();

				System.out.print("\nNOMBRE> ");
				nombre = sc.nextLine();
				sc.nextLine();
				System.out.print("\nAPELLIDOS> ");
				apellidos = sc.nextLine();
				sc.nextLine();
				System.out.print("\nSUELDO BASE> ");
				sueldoBase = sc.nextDouble();
				sc.nextLine();
				System.out.print("\nCATEGORIA> ");
				categoria = sc.nextInt();
				sc.nextLine();

				Empleado tecnico = new Tecnico(dni, nombre, apellidos, sueldoBase, categoria);

				plantilla.agregarEmpleado(tecnico);

				ok = false;
			}
			case 2 -> {
				System.out.print("\n\nDNI> ");
				dni = sc.nextLine();
				System.out.print("\nNOMBRE> ");
				nombre = sc.nextLine();
				System.out.print("\nAPELLIDOS> ");
				apellidos = sc.nextLine();
				System.out.print("\nSUELDO BASE> ");
				sueldoBase = sc.nextDouble();

				Empleado comercial = new Comercial(dni, nombre, apellidos, sueldoBase);

				plantilla.agregarEmpleado(comercial);
				ok = false;
			}
			}

		} while (ok);
	}

	public void listarTodos() {

	}

	public void listarPorFiltro() {
		Scanner sc = new Scanner(System.in);

		plantilla.getEmpleadosPorNombre(sc.nextLine());
	}

	public void listarEmpleados(List<Empleado> empleados) {
		for (Empleado i : empleados) {
			System.out.printf("%s", i);
		}
	}

	public void ordenarPorNombre(List<Empleado> empleados) {

	}
}
