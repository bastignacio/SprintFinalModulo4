package sprintFinal;

public class Revision {

	private int identificadorRevision;
	private int identificadorVisita;
	private String nombreRevision;
	private String detalleRevision;
	private int estado;
	private VisitaTerreno visitaTerreno;

	public Revision() {

	}

	public Revision(int identificadorRevision, int identificadorVisita, String nombreRevision, String detalleRevision,
			int estado, VisitaTerreno visitaTerreno) {
		super();
		this.identificadorRevision = identificadorRevision;
		this.identificadorVisita = identificadorVisita;
		this.nombreRevision = nombreRevision;
		this.detalleRevision = detalleRevision;
		this.estado = estado;
		this.visitaTerreno = visitaTerreno;
	}

	/* ---- Getters and Setters ---- */

	public VisitaTerreno getVisitaTerreno() {
		return visitaTerreno;
	}

	public void setVisitaTerreno(VisitaTerreno visitaTerreno) {
		this.visitaTerreno = visitaTerreno;
	}

	public int getIdentificadorRevision() {
		return identificadorRevision;
	}

	public void setIdentificadorRevision(int identificadorRevision) {
		this.identificadorRevision = identificadorRevision;
	}

	public int getIdentificadorVisita() {
		return identificadorVisita;
	}

	public void setIdentificadorVisita(int identificadorVisita) {
		this.identificadorVisita = identificadorVisita;
	}

	public String getNombreRevision() {
		return nombreRevision;
	}

	public void setNombreRevision(String nombreRevision) {
		this.nombreRevision = nombreRevision;
	}

	public String getDetalleRevision() {
		return detalleRevision;
	}

	public void setDetalleRevision(String detalleRevision) {
		this.detalleRevision = detalleRevision;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

}
