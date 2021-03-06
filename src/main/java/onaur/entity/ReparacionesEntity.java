package onaur.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "reparaciones")
public class ReparacionesEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column(name="pedido_onaur")
	private String pedido_onaur;
	@Column(name="pedido_cliente")
	private String pedido_cliente;
	@Column(name="num_devolucion_cliente")
	private String num_devolucion_cliente;
	@Column(name="num_reparacion")
	private String num_reparacion;
	@Column(name="articulo")
	private String articulo;
	@Column(name="observaciones_cliente")
	private String observaciones_cliente;
	@Column(name="cantidad")
	private String cantidad;
	@Column(name="fecha_entrada_material")
	private String fecha_entrada_material;
	@Column(name="servido")
	private String servido;
	@Column(name="pendiente")
	private String pendiente;
	@Column(name="diagnostico")
	private String diagnostico;
	@Column(name="trabajo_realizado")
	private String trabajo_realizado;
	@Column(name="tiempo_invertido")
	private String tiempo_invertido;
	@Column(name="referencia_material")
	private String referencia_material;
	@Column(name="movimiento_stock")
	private String movimiento_stock;
	@Column(name="observaciones")
	private String observaciones;
	
	public ReparacionesEntity() {}
	
	public ReparacionesEntity(Long id, String pedido_onaur, String pedido_cliente, String num_devolucion_cliente,
			String num_reparacion, String articulo, String observaciones_cliente, String cantidad,
			String fecha_entrada_material, String servido, String pendiente, String diagnostico,
			String trabajo_realizado, String tiempo_invertido, String referencia_material, String movimiento_stock,
			String observaciones) {
		this.id = id;
		this.pedido_onaur = pedido_onaur;
		this.pedido_cliente = pedido_cliente;
		this.num_devolucion_cliente = num_devolucion_cliente;
		this.num_reparacion = num_reparacion;
		this.articulo = articulo;
		this.observaciones_cliente = observaciones_cliente;
		this.cantidad = cantidad;
		this.fecha_entrada_material = fecha_entrada_material;
		this.servido = servido;
		this.pendiente = pendiente;
		this.diagnostico = diagnostico;
		this.trabajo_realizado = trabajo_realizado;
		this.tiempo_invertido = tiempo_invertido;
		this.referencia_material = referencia_material;
		this.movimiento_stock = movimiento_stock;
		this.observaciones = observaciones;
	}



	public Long getId() {
		return id;
	}

	public String getPedido_onaur() {
		return pedido_onaur;
	}

	public String getPedido_cliente() {
		return pedido_cliente;
	}

	public String getNum_devolucion_cliente() {
		return num_devolucion_cliente;
	}

	public String getNum_reparacion() {
		return num_reparacion;
	}

	public String getArticulo() {
		return articulo;
	}

	public String getObservaciones_cliente() {
		return observaciones_cliente;
	}

	public String getCantidad() {
		return cantidad;
	}

	public String getFecha_entrada_material() {
		return fecha_entrada_material;
	}

	public String getServido() {
		return servido;
	}

	public String getPendiente() {
		return pendiente;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public String getTrabajo_realizado() {
		return trabajo_realizado;
	}

	public String getTiempo_invertido() {
		return tiempo_invertido;
	}

	public String getReferencia_material() {
		return referencia_material;
	}

	public String getMovimiento_stock() {
		return movimiento_stock;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setPedido_onaur(String pedido_onaur) {
		this.pedido_onaur = pedido_onaur;
	}

	public void setPedido_cliente(String pedido_cliente) {
		this.pedido_cliente = pedido_cliente;
	}

	public void setNum_devolucion_cliente(String num_devolucion_cliente) {
		this.num_devolucion_cliente = num_devolucion_cliente;
	}

	public void setNum_reparacion(String num_reparacion) {
		this.num_reparacion = num_reparacion;
	}

	public void setArticulo(String articulo) {
		this.articulo = articulo;
	}

	public void setObservaciones_cliente(String observaciones_cliente) {
		this.observaciones_cliente = observaciones_cliente;
	}

	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}

	public void setFecha_entrada_material(String fecha_entrada_material) {
		this.fecha_entrada_material = fecha_entrada_material;
	}

	public void setServido(String servido) {
		this.servido = servido;
	}

	public void setPendiente(String pendiente) {
		this.pendiente = pendiente;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public void setTrabajo_realizado(String trabajo_realizado) {
		this.trabajo_realizado = trabajo_realizado;
	}

	public void setTiempo_invertido(String tiempo_invertido) {
		this.tiempo_invertido = tiempo_invertido;
	}

	public void setReferencia_material(String referencia_material) {
		this.referencia_material = referencia_material;
	}

	public void setMovimiento_stock(String movimiento_stock) {
		this.movimiento_stock = movimiento_stock;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	@Override
	public String toString() {
		return "ReparacionesEntity [id=" + id + ", pedido_onaur=" + pedido_onaur + ", pedido_cliente=" + pedido_cliente
				+ ", num_devolucion_cliente=" + num_devolucion_cliente + ", num_reparacion=" + num_reparacion
				+ ", articulo=" + articulo + ", observaciones_cliente=" + observaciones_cliente + ", cantidad="
				+ cantidad + ", fecha_entrada_material=" + fecha_entrada_material + ", servido=" + servido
				+ ", pendiente=" + pendiente + ", diagnostico=" + diagnostico + ", trabajo_realizado="
				+ trabajo_realizado + ", tiempo_invertido=" + tiempo_invertido + ", referencia_material="
				+ referencia_material + ", movimiento_stock=" + movimiento_stock + ", observaciones=" + observaciones
				+ "]";
	}
}
