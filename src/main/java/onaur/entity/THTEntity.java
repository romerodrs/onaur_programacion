package onaur.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "THT")
public class THTEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="idLote")
	private String idLote;
	@Column(name = "estado_material_onaur")
	private String estado_material_onaur;
	@Column(name = "fecha_prev_material_onaur")
	private String fecha_prev_material_onaur;
	@Column(name = "estado_material_cliente")
	private String estado_material_cliente;
	@Column(name = "fecha_prev_material_cliente")
	private String fecha_prev_material_cliente;
	@Column(name="estado_material")
	private String estado_material;
	@Column(name="tiempo")
	private String tiempo;
	@Column(name="programado_tht")
	private String programado_tht;
	@Column(name="observaciones")
	private String observaciones;
	@Column(name="semana")
	private String semana;
	
	public THTEntity() {}
	public THTEntity(Long id, String id_lote, String estado_material_onaur, String fecha_prev_material_onaur,
			String estado_material_cliente, String fecha_prev_material_cliente, String estado_material, String tiempo,
			String programado_tht, String observaciones, String semana) {
		this.id = id;
		this.idLote = id_lote;
		this.estado_material_onaur = estado_material_onaur;
		this.fecha_prev_material_onaur = fecha_prev_material_onaur;
		this.estado_material_cliente = estado_material_cliente;
		this.fecha_prev_material_cliente = fecha_prev_material_cliente;
		this.estado_material = estado_material;
		this.tiempo = tiempo;
		this.programado_tht = programado_tht;
		this.observaciones = observaciones;
		this.semana = semana;
	}
	public Long getId() {
		return id;
	}
	public String getId_lote() {
		return idLote;
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
	public String getFecha_prev_material_cliente() {
		return fecha_prev_material_cliente;
	}
	public String getEstado_material() {
		return estado_material;
	}
	public String getTiempo() {
		return tiempo;
	}
	public String getProgramado_tht() {
		return programado_tht;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public String getSemana(){
		return semana;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	public void setId_lote(String id_lote) {
		if(id_lote.equals("non_value")){
			this.idLote = " ";
		}else{
			this.idLote = id_lote;
		}
	}
	public void setEstado_material_onaur(String estado_material_onaur) {
		if(estado_material_onaur.equals("non_value")){
			this.estado_material_onaur = " ";
		}else{
			this.estado_material_onaur = estado_material_onaur;
		}
	}
	public void setFecha_prev_material_onaur(String fecha_prev_material_onaur) {
		if(fecha_prev_material_onaur.equals("non_value")){
			this.fecha_prev_material_onaur = " ";
		}else{
			this.fecha_prev_material_onaur = fecha_prev_material_onaur;
		}	
	}
	public void setEstado_material_cliente(String estado_material_cliente) {
		if(estado_material_cliente.equals("non_value")){
			this.estado_material_cliente = " ";
		}else{
			this.estado_material_cliente = estado_material_cliente;
		}
	}
	public void setFecha_prev_material_cliente(String fecha_prev_material_cliente) {
		if(fecha_prev_material_cliente.equals("non_value")){
			this.fecha_prev_material_cliente = " ";
		}else{
			this.fecha_prev_material_cliente = fecha_prev_material_cliente;
		}
	}
	public void setEstado_material(String estado_material) {
		if(estado_material.equals("non_value")){
			this.estado_material = " ";
		}else{
			this.estado_material = estado_material;
		}
	}
	public void setTiempo(String tiempo) {
		if(tiempo.equals("non_value")){
			this.tiempo = " ";
		}else{
			this.tiempo = tiempo;
		}
	}
	public void setProgramado_tht(String programado_tht) {
		if(programado_tht.equals("non_value")){
			this.programado_tht = " ";
		}else{
			this.programado_tht = programado_tht;
		}
	}
	public void setObservaciones(String observaciones) {
		if(observaciones.equals("non_value")){
			this.observaciones = " ";
		}else{
			this.observaciones = observaciones;
		}
	}
	public void setSemana(String semana){
		if(semana.equals("non_value")){
			this.semana = " ";
		}else{
			this.semana = semana;
		}
	}
	
	@Override
	public String toString() {
		return "THTEntity [id=" + id + ", idLote=" + idLote + ", estado_material_onaur=" + estado_material_onaur
				+ ", fecha_prev_material_onaur=" + fecha_prev_material_onaur + ", estado_material_cliente="
				+ estado_material_cliente + ", fecha_prev_material_cliente=" + fecha_prev_material_cliente
				+ ", estado_material=" + estado_material + ", tiempo=" + tiempo + ", programado_tht=" + programado_tht
				+ ", observaciones=" + observaciones + ", semana=" + semana + "]";
	}
}
