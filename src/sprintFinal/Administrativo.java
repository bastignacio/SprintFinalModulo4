package sprintFinal;

import java.time.LocalDate;

public class Administrativo extends Usuario implements Asesoria {

	private String area;
	private String experienciaPrevia;

	public Administrativo() {

	}

	public Administrativo(String nombre, LocalDate fechaNacimiento, int run, String area, String experienciaPrevia) {
		super(nombre, fechaNacimiento, run);
		this.area = area;
		this.experienciaPrevia = experienciaPrevia;

	}

	public void analizarUsuario() {

		System.out.println("Nombre: " + getNombre() + ", Fecha Nacimiento: " + getFechaNacimiento() + ", RUN: "
				+ getRun() + ", Área: " + getArea() + ", Experiencia previa: " + getExperienciaPrevia());
	}

	/* ---- Getters and Setters ---- */

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getExperienciaPrevia() {
		return experienciaPrevia;
	}

	public void setExperienciaPrevia(String experienciaPrevia) {
		this.experienciaPrevia = experienciaPrevia;
	}

}
