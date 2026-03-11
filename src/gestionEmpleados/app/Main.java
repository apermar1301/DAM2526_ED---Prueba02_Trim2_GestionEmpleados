package gestionEmpleados.app;

import gestionEmpleados.domain.Plantilla;
import gestionEmpleados.utils.Consola;
import gestionEmpleados.utils.IEntradaSalida;

public class Main {

	public static void main(String[] args) {
		Plantilla plantilla = new Plantilla();
		IEntradaSalida consola = new Consola();
		GestorEmpleados gestorEmpleados = new GestorEmpleados(plantilla, consola);

		gestorEmpleados.ejecutar();
	}

}
