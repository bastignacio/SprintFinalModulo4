package sprintFinal;

import java.time.LocalDate;

/**
 * 
 * @author BastianEspinosa
 * @version 1.0
 * @since 1.1
 */
public class Profesional extends Usuario implements Asesoria {
	
	/**
	 * Clase profesional que hereda parámetros de la clase Usuarios y que utiliza la interfaz Asesoria.
	 */

	private String titulo;
	private LocalDate fechaIngreso;

	public Profesional() {

	}

	/**
	 * El constructor con parámetro Profesional utiliza las variables definidas por el cliente y además las heredadas.
	 * @param nombre variable heredada de la clase Usuario
	 * @param fechaNacimiento variable heredada de la clase Usuario
	 * @param run variable heredada de la clase Usuario
	 * @param titulo
	 * @param fechaIngreso
	 */
	public Profesional(String nombre, LocalDate fechaNacimiento, int run, String titulo, LocalDate fechaIngreso) {
		super(nombre, fechaNacimiento, run);
		this.titulo = titulo;
		this.fechaIngreso = fechaIngreso;
	}




	public void analizarUsuario() {

		System.out.println("Nombre: " + getNombre() + ", Fecha Nacimiento: " + getFechaNacimiento() + ", RUN: "
				+ getRun() + ", Título: " + getTitulo() + ", Fecha de Ingreso: " + getFechaIngreso());
	}

	/* ---- Getters and Setters ---- */

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}


	@Override
	public String toString() {
		return super.toString() + "Profesional [titulo=" + titulo + ", fechaIngreso=" + fechaIngreso + "]";
	}

	
}
