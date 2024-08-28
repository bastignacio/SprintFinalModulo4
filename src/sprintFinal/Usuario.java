package sprintFinal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Usuario {

	DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	private String nombre;
	private LocalDate fechaNacimiento;
	private int run;

	public Usuario() {

	}

	public Usuario(String nombre, LocalDate fechaNacimiento, int run) {
		super();
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.run = run;
	}

	public int mostrarEdad(String fechaNacimiento) {

		LocalDate fechaHoy = LocalDate.now();
		LocalDate fechaNacimientoDate = LocalDate.parse(fechaNacimiento, formato);
		int edadCalculada = fechaHoy.getYear() - fechaNacimientoDate.getYear();

		if (fechaHoy.getMonthValue() < fechaNacimientoDate.getMonthValue()
				|| (fechaHoy.getMonthValue() == fechaNacimientoDate.getMonthValue()
						&& fechaHoy.getDayOfMonth() < fechaNacimientoDate.getDayOfMonth())) {
			edadCalculada--;

		}

		System.out.println("El usuario tiene " + edadCalculada + " años.");
		return edadCalculada;
	}
	

	/* ---- Getters and Setters ---- */

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getRun() {
		return run;
	}

	public void setRun(int run) {
		this.run = run;
	}

	@Override
	public String toString() {
		return "Usuario [formato=" + formato + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", run="
				+ run + "]";
	}
	
	
}