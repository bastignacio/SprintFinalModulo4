package sprintFinal;

import java.time.LocalDate;

public class Profesional extends Usuario implements Asesoria {

	private String titulo;
	private LocalDate fechaIngreso;

	public Profesional() {

	}


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

}
