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

		int opcion;
		do {
			consola.mostrarMenu();
			System.out.printf("\n> %s", opcion = sc.nextInt());

			if (opcion == 1) { // 1

				contratarEmpleado();

			} else if (opcion == 2) { // 2

			} else if (opcion == 3) { // 3

				listarPorFiltro();

			} else if (opcion == 4) { // 4
				continue;
			} else {
				opcion = 0;
			}

		} while (opcion != 4);

	}

	public void contratarEmpleado() {
		Scanner sc = new Scanner(System.in);

		// Datos Empleados
		String dni;
		String nombre;
		String apellidos;
		double sueldoBase;
		int categoria;
		int ventas;

		int opcion;
		do {
			System.out.println("1 - Técnico\n" + "\n2 - Comercial");
			System.out.printf("\n> %s", opcion = sc.nextInt());

			if (opcion == 1) { // Técnico

				System.out.printf("\n\nDNI> %s", dni = sc.nextLine());
				System.out.printf("\nNOMBRE> %s", nombre = sc.nextLine());
				System.out.printf("\nAPELLIDOS> %s", apellidos = sc.nextLine());
				System.out.printf("\nSUELDO BASE> %s", sueldoBase = sc.nextDouble());
				System.out.printf("\nCATEGORIA> %s", categoria = sc.nextInt());

				Empleado tecnico = new Tecnico(dni, nombre, apellidos, sueldoBase, categoria);

				plantilla.agregarEmpleado(tecnico);

			} else if (opcion == 2) { // Comercial

				System.out.printf("\n\nDNI> %s", dni = sc.nextLine());
				System.out.printf("\nNOMBRE> %s", nombre = sc.nextLine());
				System.out.printf("\nAPELLIDOS> %s", apellidos = sc.nextLine());
				System.out.printf("\nSUELDO BASE> %s", sueldoBase = sc.nextDouble());

				Empleado comercial = new Comercial(dni, nombre, apellidos, sueldoBase);

				plantilla.agregarEmpleado(comercial);

			} else {
				opcion = 0;
			}
			consola.pausa();

		} while (opcion == 1 || opcion == 2);
	}

	public void listarTodos() {

	}

	public void listarPorFiltro() {
		// TODO document why this method is empty
	}

	public void listarEmpleados(List<Empleado> empleados) {
		for (Empleado i : empleados) {
			System.out.printf("%s", i);
		}
	}

	public void ordenarPorNOmbre(List<Empleado> empleados) {
		// TODO document why this method is empty
	}
}
