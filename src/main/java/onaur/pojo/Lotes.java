package onaur.pojo;

public class Lotes {
	
	private String idLote;
	private String referencia;
	private String lote;
	
	public Lotes(String referencia, String lote) {
		this.idLote = referencia + "_" + lote;
		this.referencia = referencia;
		this.lote = lote;
	}
	
	public String getIdLote() {
		return idLote;
	}
	public void setIdLote(String idLote) {
		this.idLote = idLote;
	}
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	public String getLote() {
		return lote;
	}
	public void setLote(String lote) {
		this.lote = lote;
	}
	
	@Override
	public String toString() {
		return "Lotes [idLote=" + idLote + ", referencia=" + referencia + ", lote=" + lote + "]";
	}
	
}
