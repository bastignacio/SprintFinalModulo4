package sprintFinal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 
 * @author BastianEspinosa
 * @version 1.0
 * @since 1.1
 */

public class Contenedor {

	/**
	 * Listas necesarias para poder almacenar la información de usuarios y
	 * capacitaciones.
	 */
	private List<Asesoria> listaAsesorias;

	private List<Capacitacion> listaCapacitaciones;

	public Contenedor() {
		listaAsesorias = new ArrayList<>();
		listaCapacitaciones = new ArrayList<>();
	}

	public void agregarAsesoria(Asesoria asesoria) {
		listaAsesorias.add(asesoria);
	}

	public void almacenarCapacitacion(Capacitacion capacitacion) {
		listaCapacitaciones.add(capacitacion);
	}

	public void almacenarAdministrativo(Administrativo administrativo) {
		listaAsesorias.add(administrativo);

	}

	public void almacenarCliente(Cliente cliente) {
		listaAsesorias.add(cliente);
	}

	public void almacenarProfesional(Profesional profesional) {
		listaAsesorias.add(profesional);
	}

	public void eliminarUsuario(String run) {
		int runInt = Integer.parseInt(run);
		System.out.println("Buscando usuario con RUN: " + runInt);
		Iterator<Asesoria> iterator = listaAsesorias.iterator();
		while (iterator.hasNext()) {

			Asesoria asesoria = iterator.next();
			if (asesoria instanceof Usuario) {
				Usuario usuario = (Usuario) asesoria;
				System.out.println("Comparando con usuario RUN: " + usuario.getRun());

				if (usuario.getRun() == runInt) { // Comparación directa de números
					System.out.println("Usuario encontrado. Eliminando...");
					iterator.remove();
					System.out.println("Usuario con RUN " + run + " eliminado.");
					return;
				}
			}
		}
		System.out.println("Usuario con RUN " + run + " no encontrado.");
	}

	public void listarUsuarios() {
		boolean hayUsuarios = false;

		for (Asesoria asesoria : listaAsesorias) {
			if (asesoria instanceof Usuario) {
				Usuario usuario = (Usuario) asesoria;
				System.out.println(usuario);
				hayUsuarios = true;
			}
		}

		if (!hayUsuarios) {
			System.out.println("\n[------ No existen usuarios registrados. ------]\n");
		}
	}

	public void listarUsuariosPorTipo(Class<?> tipo) {
		boolean hayUsuarios = false;

		for (Asesoria asesoria : listaAsesorias) {
			if (tipo.isInstance(asesoria)) {
				Usuario usuario = (Usuario) asesoria;
				System.out.println(usuario);
				hayUsuarios = true;
			}
		}

		if (!hayUsuarios) {
			System.out.println("\n[------ No existen usuarios registrados. ------]\n");
		}
	}

	public void listarCapacitaciones() {
		boolean hayCapacitaciones = false;
		for (Capacitacion capacitacion : listaCapacitaciones) {
			System.out.println(capacitacion);
			System.out.println("Cliente asociado: " + capacitacion.getCliente());
			hayCapacitaciones = true;
		}
		if (!hayCapacitaciones) {
			System.out.println("\n[------ No existen capacitaciones registradas. ------]\n");

		}
	}
}
