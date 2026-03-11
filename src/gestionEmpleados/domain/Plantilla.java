package gestionEmpleados.domain;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Plantilla {

	private List<Empleado> empleados;

	public Plantilla() {
	}

	public void agregarEmpleado(Empleado empleado) {
		empleados.add(empleado);
	}

	public List<Empleado> getEmpleadosPorNombre(String filtroNombre) {
		Pattern pattern = Pattern.compile(filtroNombre, Pattern.CASE_INSENSITIVE);
		Matcher matcher = null;
		List<Empleado> empleadosFiltro = null;
		for (Empleado i : empleados) {
			pattern.matcher((CharSequence) i);
			if (matcher.find()) {
				empleadosFiltro.add(i);
			}
		}
		return empleadosFiltro;
	}

}
