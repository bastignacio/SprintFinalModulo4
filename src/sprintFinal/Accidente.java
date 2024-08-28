package sprintFinal;


/**
 * 
 * @author BastianEspinosa
 * @version 1.0
 * @since 1.1
 */
public class Accidente {

	private int identificadorAccidente;
	private int rut;
	private String fechaAccidente;
	private String horaAccidente;
	private String lugar;
	private String origen;
	private String consecuencias;
	private Cliente cliente;

	
	/**
	 * Constructor sin parámetros.
	 */
	public Accidente () {
		
	}
	
	/**
	 * Constructor con paráemetros definidos.
	 * @param identificadorAccidente 
	 * @param rut
	 * @param fechaAccidente
	 * @param horaAccidente
	 * @param lugar
	 * @param origen
	 * @param consecuencias
	 * @param cliente
	 */
	
	public Accidente(int identificadorAccidente, int rut, String fechaAccidente, String horaAccidente, String lugar,
			String origen, String consecuencias, Cliente cliente) {
		super();
		this.identificadorAccidente = identificadorAccidente;
		this.rut = rut;
		this.fechaAccidente = fechaAccidente;
		this.horaAccidente = horaAccidente;
		this.lugar = lugar;
		this.origen = origen;
		this.consecuencias = consecuencias;
		this.cliente = cliente;
	}
	
	
	/* ---- Getters and Setters ---- */
	
	
	
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getIdentificadorAccidente() {
		return identificadorAccidente;
	}

	public void setIdentificadorAccidente(int identificadorAccidente) {
		this.identificadorAccidente = identificadorAccidente;
	}

	public int getRut() {
		return rut;
	}

	public void setRut(int rut) {
		this.rut = rut;
	}

	public String getFechaAccidente() {
		return fechaAccidente;
	}

	public void setFechaAccidente(String fechaAccidente) {
		this.fechaAccidente = fechaAccidente;
	}

	public String getHoraAccidente() {
		return horaAccidente;
	}

	public void setHoraAccidente(String horaAccidente) {
		this.horaAccidente = horaAccidente;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getConsecuencias() {
		return consecuencias;
	}

	public void setConsecuencias(String consecuencias) {
		this.consecuencias = consecuencias;
	}

	@Override
	public String toString() {
		return "Accidente [identificadorAccidente=" + identificadorAccidente + ", rut=" + rut + ", fechaAccidente="
				+ fechaAccidente + ", horaAccidente=" + horaAccidente + ", lugar=" + lugar + ", origen=" + origen
				+ ", consecuencias=" + consecuencias + ", cliente=" + cliente + "]";
	}
	
	

}
