package sprintFinal;

public class VisitaTerreno {

	private int identificadorVisita;
	private int rut;
	private String diaVisita;
	private String horaVisita;
	private String lugar;
	private String comentarios;
	/**
	 * Al definir la Clase Clientes con los objetos clientes nos aseguramos que cada
	 * instancia de VisitaTerreno esté asociada a un objeto de Cliente.
	 */
	public Cliente cliente;

	public VisitaTerreno() {

	}

	public VisitaTerreno(int identificadorVisita, int rut, String diaVisita, String horaVisita, String lugar,
			String comentarios, Cliente cliente) {
		super();
		this.identificadorVisita = identificadorVisita;
		this.rut = rut;
		this.diaVisita = diaVisita;
		this.horaVisita = horaVisita;
		this.lugar = lugar;
		this.comentarios = comentarios;
		this.cliente = cliente;
	}

	/* ---- Getters and Setters ---- */

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getIdentificadorVisita() {
		return identificadorVisita;
	}

	public void setIdentificadorVisita(int identificadorVisita) {
		this.identificadorVisita = identificadorVisita;
	}

	public int getRut() {
		return rut;
	}

	public void setRut(int rut) {
		this.rut = rut;
	}

	public String getDiaVisita() {
		return diaVisita;
	}

	public void setDiaVisita(String diaVisita) {
		this.diaVisita = diaVisita;
	}

	public String getHoraVisita() {
		return horaVisita;
	}

	public void setHoraVisita(String horaVisita) {
		this.horaVisita = horaVisita;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	@Override
	public String toString() {
		return "VisitaTerreno [identificadorVisita=" + identificadorVisita + ", rut=" + rut + ", diaVisita=" + diaVisita
				+ ", horaVisita=" + horaVisita + ", lugar=" + lugar + ", comentarios=" + comentarios + ", cliente="
				+ cliente + "]";
	}
	
	
}
