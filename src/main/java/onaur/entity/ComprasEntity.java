package onaur.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "compras")
public class ComprasEntity {
	
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    @Column(name = "fecha_solicitud")
    private String fecha_solicitud;
    @Column(name = "fecha_confirmacion")
    private String fecha_confirmacion;
    @Column(name = "OF")
    private String OF;
    @Column(name = "idLote")
    private String idLote;
    @Column(name = "cantidad")
    private String cantidad;
    @Column(name = "observaciones")
    private String observaciones;
    @Column(name = "cantidad_servida")
    private String cantidad_servida;
    @Column(name = "fecha_servida")
    private String fecha_servida;
    
	public String getIdLote() {
		return idLote;
	}

	public void setIdLote(String idLote) {
		this.idLote = idLote;
	}

	public String getCantidad_servida() {
		return cantidad_servida;
	}

	public void setCantidad_servida(String cantidad_servida) {
		this.cantidad_servida = cantidad_servida;
	}

	public String getFecha_servida() {
		return fecha_servida;
	}

	public void setFecha_servida(String fecha_servida) {
		this.fecha_servida = fecha_servida;
	}

	public ComprasEntity() {}
	
	public ComprasEntity(Long id, String fecha_solicitud, String fecha_confirmacion, String oF, String idLote,
			String cantidad, String observaciones, String cantidad_servida, String fecha_servida) {
		this.id = id;
		this.fecha_solicitud = fecha_solicitud;
		this.fecha_confirmacion = fecha_confirmacion;
		this.OF = oF;
		this.idLote = idLote;
		this.cantidad = cantidad;
		this.observaciones = observaciones;
		this.cantidad_servida = cantidad_servida;
		this.fecha_servida = fecha_servida;
	}

	public Long getId() {
		return id;
	}
	public String getFecha_solicitud() {
		return fecha_solicitud;
	}
	public String getFecha_confirmacion() {
		return fecha_confirmacion;
	}
	public String getOF() {
		return OF;
	}
	public String getId_lote() {
		return idLote;
	}
	public String getCantidad() {
		return cantidad;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setFecha_solicitud(String fecha_solicitud) {
		if(fecha_solicitud.equals("non_value")){
			this.fecha_solicitud = " ";
		}else{
			this.fecha_solicitud = fecha_solicitud;
		}
	}
	public void setFecha_confirmacion(String fecha_confirmacion) {
		if(fecha_confirmacion.equals("non_value")){
			this.fecha_confirmacion = " ";
		}else{ 
			this.fecha_confirmacion = fecha_confirmacion;
		}
	}
	public void setOF(String oF) {
		if(oF.equals("non_value")){
			this.OF = " ";
		}else{
			this.OF = oF;
		}
	}
	public void setId_lote(String id_lote) {
		if(id_lote.equals("non_value")){
			this.idLote = " ";
		}else{	
			this.idLote = id_lote;
		}
	}
	public void setCantidad(String cantidad) {
		if(cantidad.equals("non_value")){
			this.cantidad = " ";
		}else{
			this.cantidad = cantidad;
		}
			
	}
	public void setObservaciones(String observaciones) {
		if(observaciones.equals("non_value")){
			this.observaciones = " ";
		}else{
			this.observaciones = observaciones;
		}
	}
	@Override
	public String toString() {
		return "ComprasEntity [id=" + id + ", fecha_solicitud=" + fecha_solicitud + ", fecha_confirmacion="
				+ fecha_confirmacion + ", OF=" + OF + ", idLote=" + idLote + ", cantidad=" + cantidad
				+ ", observaciones=" + observaciones + ", cantidad_servida=" + cantidad_servida + ", fecha_servida="
				+ fecha_servida + "]";
	}
    
}
