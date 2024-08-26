package sprintFinal;

public class Accidente {

	private int identificadorAccidente;
	private int rut;
	private String fechaAccidente;
	private String horaAccidente;
	private String lugar;
	private String origen;
	private String consecuencias;
	private Cliente cliente;

	public Accidente () {
		
	}
	
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

}
