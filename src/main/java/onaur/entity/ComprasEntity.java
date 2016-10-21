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
    @Column(name = "id_lote")
    private String id_lote;
    @Column(name = "cantidad")
    private String cantidad;
    @Column(name = "observaciones")
    private String observaciones;
    
	public ComprasEntity() {}
	
	public ComprasEntity(Long id, String fecha_solicitud, String fecha_confirmacion, String oF, String id_lote,
			String cantidad, String observaciones) {
		this.id = id;
		this.fecha_solicitud = fecha_solicitud;
		this.fecha_confirmacion = fecha_confirmacion;
		this.OF = oF;
		this.id_lote = id_lote;
		this.cantidad = cantidad;
		this.observaciones = observaciones;
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
		return id_lote;
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
		this.fecha_solicitud = fecha_solicitud;
	}
	public void setFecha_confirmacion(String fecha_confirmacion) {
		this.fecha_confirmacion = fecha_confirmacion;
	}
	public void setOF(String oF) {
		OF = oF;
	}
	public void setId_lote(String id_lote) {
		this.id_lote = id_lote;
	}
	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	@Override
	public String toString() {
		return "ComprasEntity [id=" + id + ", fecha_solicitud=" + fecha_solicitud + ", fecha_confirmacion="
				+ fecha_confirmacion + ", OF=" + OF + ", id_lote=" + id_lote + ", cantidad=" + cantidad
				+ ", observaciones=" + observaciones + "]";
	}
    
    
    
}
