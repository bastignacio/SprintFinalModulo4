package sprintFinal;

import java.time.LocalDate;

public class Cliente extends Usuario implements Asesoria {

	private int rut;
	private String nombres;
	private String apellidos;
	private Long telefono;
	private String afp;
	private String sistemaSalud;
	private String direccion;
	private String comuna;
	private int edad;

	public Cliente() {

	}

	public Cliente(String nombre, LocalDate fechaNacimiento, int run, int rut, String nombres, String apellidos,
			Long telefono, String afp, String sistemaSalud, String direccion, String comuna, int edad) {
		super(nombre, fechaNacimiento, run);
		this.rut = rut;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.afp = afp;
		this.sistemaSalud = sistemaSalud;
		this.direccion = direccion;
		this.comuna = comuna;
		this.edad = edad;
	}

	public String obtenerNombre() {

		return "El nombre completo es: " + getNombres() + getApellidos();
	}

	public String obtenerSistemaSalud() {

		return "El sistema de salud es: " + getSistemaSalud();
	}

	public void analizarUsuario() {

		System.out.println("Nombre: " + getNombre() + ", Fecha Nacimiento: " + getFechaNacimiento() + ", RUN: "
				+ getRun() + ", Dirección: " + getDireccion() + ", Comuna: " + getComuna());
	}

	/* ---- Getters and Setters ---- */

	public int getRut() {
		return rut;
	}

	public void setRut(int rut) {
		this.rut = rut;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Long getTelefono() {
		return telefono;
	}

	public void setTelefono(Long telefono) {
		this.telefono = telefono;
	}

	public String getAfp() {
		return afp;
	}

	public void setAfp(String afp) {
		this.afp = afp;
	}

	public String getSistemaSalud() {
		return sistemaSalud;
	}

	public void setSistemaSalud(String sistemaSalud) {
		this.sistemaSalud = sistemaSalud;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getComuna() {
		return comuna;
	}

	public void setComuna(String comuna) {
		this.comuna = comuna;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Cliente [rut=" + rut + ", nombres=" + nombres + ", apellidos=" + apellidos + ", telefono=" + telefono
				+ ", afp=" + afp + ", sistemaSalud=" + sistemaSalud + ", direccion=" + direccion + ", comuna=" + comuna
				+ ", edad=" + edad + "]";
	}

}
