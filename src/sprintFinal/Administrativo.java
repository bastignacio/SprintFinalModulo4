package sprintFinal;

import java.time.LocalDate;

/**
 * 
 * @author BastianEspinosa
 * @version 1.0
 * @since 1.1
 */

public class Administrativo extends Usuario implements Asesoria {

	private String area;
	private String experienciaPrevia;

	public Administrativo() {

	}

	/**
	 * Clase administrativo con variables solicitadas que hereda la clase Usuario e
	 * implementa la interfaz Asesoria.
	 * 
	 * @param nombre            Variable heredada de la clase Usuario
	 * @param fechaNacimiento   Variable heredad de la clase Usuario
	 * @param run
	 * @param area
	 * @param experienciaPrevia
	 */

	public Administrativo(String nombre, LocalDate fechaNacimiento, int run, String area, String experienciaPrevia) {
		super(nombre, fechaNacimiento, run);
		this.area = area;
		this.experienciaPrevia = experienciaPrevia;

	}

	/**
	 * Se crea el método analizarUsuario para llamar a las variables de la clase
	 * pádre y mostrar las variables de esta clase.
	 */
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

	@Override
	public String toString() {
		return super.toString() + "Administrativo [area=" + area + ", experienciaPrevia=" + experienciaPrevia + "]";
	}

}
