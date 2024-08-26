package sprintFinal;

import java.time.LocalTime;

public class Capacitacion {

	private int identificador;
	private int rut;
	private String diaSemana;
	private LocalTime hora;
	private String lugar;
	private LocalTime duracion;
	private int cantidadAsistentes;
	private int duracionMinutos;
	private Cliente cliente;

	public Capacitacion() {

	}

	public Capacitacion(int identificador, int rut, String diaSemana, LocalTime hora, String lugar, LocalTime duracion,
			int cantidadAsistentes) {
		super();
		this.identificador = identificador;
		this.rut = rut;
		this.diaSemana = diaSemana;
		this.hora = hora;
		this.lugar = lugar;
		this.duracion = duracion;
		this.cantidadAsistentes = cantidadAsistentes;

	}

	public Capacitacion(int identificador, int rut, String diaSemana, LocalTime hora, String lugar, LocalTime duracion,
			int cantidadAsistentes, Cliente cliente) {
		super();
		this.identificador = identificador;
		this.rut = rut;
		this.diaSemana = diaSemana;
		this.hora = hora;
		this.lugar = lugar;
		this.duracion = duracion;
		this.cantidadAsistentes = cantidadAsistentes;
		this.cliente = cliente;
	}

	public void establecerDuracion() {
		Validadores validadores = new Validadores();
		this.setDuracionMinutos(validadores.convertirDuracionAMinutos());
	}

	public String mostrarDetalle() {
		return "La capacitación será en: " + getLugar() + ", a las " + getHora() + ", del día " + getDiaSemana()
				+ " y durará " + getDuracionMinutos();
	}

	/* ---- Getters and Setters ---- */

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public int getRut() {
		return rut;
	}

	public void setRut(int rut) {
		this.rut = rut;
	}

	public String getDiaSemana() {
		return diaSemana;
	}

	public void setDiaSemana(String diaSemana) {
		this.diaSemana = diaSemana;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public LocalTime getDuracion() {
		return duracion;
	}

	public void setDuracion(LocalTime duracion) {
		this.duracion = duracion;
	}

	public int getCantidadAsistentes() {
		return cantidadAsistentes;
	}

	public void setCantidadAsistentes(int cantidadAsistentes) {
		this.cantidadAsistentes = cantidadAsistentes;
	}

	public int getDuracionMinutos() {
		return duracionMinutos;
	}

	public void setDuracionMinutos(int duracionMinutos) {
		this.duracionMinutos = duracionMinutos;
	}

}
