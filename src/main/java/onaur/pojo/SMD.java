package onaur.pojo;

public class SMD {

	private String fecha_entrega;
	private String semana;
	private String convencional;
	private String referencia;
	private String lote;
	private String articulo;
	private String cantidad;
	private String CAD_intro;
	private String CAD_mod;
	private String horas;
	private String observaciones;
	public String getFecha_entrega() {
		return fecha_entrega;
	}
	public String getSemana() {
		return semana;
	}
	public String getConvencional() {
		return convencional;
	}
	public String getReferencia() {
		return referencia;
	}
	public String getLote() {
		return lote;
	}
	public String getArticulo() {
		return articulo;
	}
	public String getCantidad() {
		return cantidad;
	}
	public String getCAD_intro() {
		return CAD_intro;
	}
	public String getCAD_mod() {
		return CAD_mod;
	}
	public String getHoras() {
		return horas;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setFecha_entrega(String fecha_entrega) {
		this.fecha_entrega = fecha_entrega;
	}
	public void setSemana(String semana) {
		this.semana = semana;
	}
	public void setConvencional(String convencional) {
		this.convencional = convencional;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	public void setLote(String lote) {
		this.lote = lote;
	}
	public void setArticulo(String articulo) {
		this.articulo = articulo;
	}
	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	public void setCAD_intro(String cAD_intro) {
		CAD_intro = cAD_intro;
	}
	public void setCAD_mod(String cAD_mod) {
		CAD_mod = cAD_mod;
	}
	public void setHoras(String horas) {
		this.horas = horas;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	@Override
	public String toString() {
		return "SMD [fecha_entrega=" + fecha_entrega + ", semana=" + semana + ", convencional=" + convencional
				+ ", referencia=" + referencia + ", lote=" + lote + ", articulo=" + articulo + ", cantidad=" + cantidad
				+ ", CAD_intro=" + CAD_intro + ", CAD_mod=" + CAD_mod + ", horas=" + horas + ", observaciones="
				+ observaciones + "]";
	}
	
}
