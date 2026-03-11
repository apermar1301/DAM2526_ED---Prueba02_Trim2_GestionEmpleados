package gestionEmpleados.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Plantilla {

	private List<Empleado> empleados = new ArrayList<>();

	public Plantilla() {
	}

	public void agregarEmpleado(Empleado empleado) {
		empleados.add(empleado);

	}

	public List<Empleado> getEmpleadosPorNombre(String filtroNombre) {
		Pattern pattern = Pattern.compile(filtroNombre, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher("");
		List<Empleado> empleadosFiltro = new ArrayList<>();
		for (Empleado i : empleados) {
			matcher.reset((CharSequence) i);
			if (matcher.find()) {

				empleadosFiltro.add(i);
			}
		}
		return empleadosFiltro;
	}

}
