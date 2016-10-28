package onaur.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "SMD")
public class SMDEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@Column(name = "semana")
	private String semana;
	@Column(name = "idLote")
	private String idLote;
	@Column(name = "CAD")
	private String CAD;
	@Column(name = "estado_material_onaur")
	private String estado_material_onaur;
	@Column(name = "fecha_prev_material_onaur")
	private String fecha_prev_material_onaur;
	@Column(name = "estado_material_cliente")
	private String estado_material_cliente;
	@Column(name = "fecha_prev_material_cliente")
	private String fecha_prev_material_cliente;
	@Column(name = "estado")
	private String estado;
	@Column(name = "tiempo")
	private String tiempo;
	@Column(name = "programado_smd")
	private String programado_smd;
	@Column(name = "observaciones")
	private String observaciones;
	@Column(name = "pantalla")
	private String pantalla;
	@Column(name = "pantalla_estado")
	private String pantalla_estado;
	
	public SMDEntity() {}
	
	public SMDEntity(Long id, String semana, String id_lote, String cAD, String estado_material_onaur,
			String fecha_prev_material_onaur, String estado_material_cliente, String estado, String tiempo,
			String programado_smd, String observaciones, String pantalla, String pantalla_estado) {
		this.id = id;
		this.semana = semana;
		this.idLote = id_lote;
		CAD = cAD;
		this.estado_material_onaur = estado_material_onaur;
		this.fecha_prev_material_onaur = fecha_prev_material_onaur;
		this.estado_material_cliente = estado_material_cliente;
		this.estado = estado;
		this.tiempo = tiempo;
		this.programado_smd = programado_smd;
		this.observaciones = observaciones;
		this.pantalla = pantalla;
		this.pantalla_estado = pantalla_estado;
	}

	public Long getId() {
		return id;
	}

	public String getSemana() {
		return semana;
	}

	public String getId_lote() {
		return idLote;
	}

	public String getCAD() {
		return CAD;
	}

	public String getEstado_material_onaur() {
		return estado_material_onaur;
	}

	public String getFecha_prev_material_onaur() {
		return fecha_prev_material_onaur;
	}

	public String getEstado_material_cliente() {
		return estado_material_cliente;
	}

	public String getEstado() {
		return estado;
	}

	public String getTiempo() {
		return tiempo;
	}

	
	public String getProgramado_smd() {
		return programado_smd;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public String getPantalla() {
		return pantalla;
	}

	public String getPantalla_estado() {
		return pantalla_estado;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setSemana(String semana) {
		this.semana = semana;
	}

	public void setId_lote(String id_lote) {
		this.idLote = id_lote;
	}

	public void setCAD(String cAD) {
		CAD = cAD;
	}

	public void setEstado_material_onaur(String estado_material_onaur) {
		this.estado_material_onaur = estado_material_onaur;
	}

	public void setFecha_prev_material_onaur(String fecha_prev_material_onaur) {
		this.fecha_prev_material_onaur = fecha_prev_material_onaur;
	}

	public void setEstado_material_cliente(String estado_material_cliente) {
		this.estado_material_cliente = estado_material_cliente;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public void setTiempo(String tiempo) {
		this.tiempo = tiempo;
	}

	public String getFecha_prev_material_cliente() {
		return fecha_prev_material_cliente;
	}

	public void setProgramado_smd(String programado_smd) {
		this.programado_smd = programado_smd;
	}
	
	public void setFecha_prev_material_cliente(String fecha_prev_material_cliente) {
		this.fecha_prev_material_cliente = fecha_prev_material_cliente;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public void setPantalla(String pantalla) {
		this.pantalla = pantalla;
	}

	public void setPantalla_estado(String pantalla_estado) {
		this.pantalla_estado = pantalla_estado;
	}
	
	@Override
	public String toString() {
		return "SMDEntity [id=" + id + ", semana=" + semana + ", idLote=" + idLote + ", CAD=" + CAD
				+ ", estado_material_onaur=" + estado_material_onaur + ", fecha_prev_material_onaur="
				+ fecha_prev_material_onaur + ", estado_material_cliente=" + estado_material_cliente
				+ ", fecha_prev_material_cliente=" + fecha_prev_material_cliente + ", estado=" + estado + ", tiempo="
				+ tiempo + ", programado_smd=" + programado_smd + ", observaciones=" + observaciones + ", pantalla="
				+ pantalla + ", pantalla_estado=" + pantalla_estado + "]";
	}



}
