package onaur.view;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.event.ValueChangeEvent;

import org.primefaces.event.ItemSelectEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import onaur.dao.ArticulosDAO;
import onaur.entity.ArticuloEntity;

@Component("nuevoPedido")
public class NuevoPedidoBean implements Serializable{

		@Autowired
		private ArticulosDAO articulosDAO;
		private List<ArticuloEntity> articulosList;
		private Map<String, String> articulosMap;
		private Map<String, String> articulosRefMap;
		private String articuloReferencia;
		private String articuloDescripcion  = "selecciona primero una descripcion";
		private String lote;
		private String cantidad;
		private String of;
		private String fechaSolicitada;
		private String fechaEstimada;
		private String pedidoConfirmado;
		private String cantidadServida;
		private String fechaServida;
		// SMD Vars
		private boolean pantalla;
		private boolean smd;
		private String numPedidoPantalla;
		private String estadoPantalla;
		private String cad;
		private String horasSmd;
		private String fechaPrevMatOnaurSmd;
		private String estadoMaterialOnaurSmd;
		private String fechaMatClienteSmd;
		private String estadoMaterialClienteSmd;
		private String estadoMaterialSmd;
		private String programadoSmd;
		private String semanaSmd;
		private String observacionesSmd;
		//THT Vars
		private boolean tht;
		private String horasTht;
		private String fechaPrevMatOnaurTht;
		private String estadoMaterialOnaurTht;
		private String fechaMatClienteTht;
		private String estadoMaterialClienteTht;
		private String estadoMaterialTht;
		private String materialPreparadoTht;
		private String programadoTht;
		private String semanaTht;
		private String observacionesTht;
		//Observaciones
		private String observaciones;
		
		@PostConstruct
		public void init(){
			articulosMap = new HashMap<String, String>();
			articulosRefMap = new HashMap<String, String>();
			articulosList = articulosDAO.findAllByOrderByReferenciaAsc();
			for (ArticuloEntity articuloEntity : articulosList) {
				articulosMap.put(articuloEntity.getReferencia() , articuloEntity.getArticulo());
				articulosRefMap.put(articuloEntity.getReferencia() , articuloEntity.getReferencia());
			}
		}
		
		public ArticulosDAO getArticulosDAO() {
			return articulosDAO;
		}

		public List<ArticuloEntity> getArticulosList() {
			return articulosList;
		}

		public Map<String, String> getArticulosMap() {
			return articulosMap;
		}

		public Map<String, String> getArticulosRefMap() {
			return articulosRefMap;
		}

		public String getArticuloReferencia() {
			return articuloReferencia;
		}

		public String getArticuloDescripcion() {
			return articuloDescripcion;
		}

		public String getLote() {
			return lote;
		}

		public String getCantidad() {
			return cantidad;
		}

		public String getOf() {
			return of;
		}

		public String getFechaSolicitada() {
			return fechaSolicitada;
		}

		public String getFechaEstimada() {
			return fechaEstimada;
		}

		public String getPedidoConfirmado() {
			return pedidoConfirmado;
		}

		public String getCantidadServida() {
			return cantidadServida;
		}

		public String getFechaServida() {
			return fechaServida;
		}

		public boolean isPantalla() {
			return pantalla;
		}

		public boolean isSmd() {
			return smd;
		}

		public String getNumPedidoPantalla() {
			return numPedidoPantalla;
		}

		public String getEstadoPantalla() {
			return estadoPantalla;
		}

		public String getCad() {
			return cad;
		}

		public String getHorasSmd() {
			return horasSmd;
		}

		public String getFechaPrevMatOnaurSmd() {
			return fechaPrevMatOnaurSmd;
		}

		public String getEstadoMaterialOnaurSmd() {
			return estadoMaterialOnaurSmd;
		}

		public String getFechaMatClienteSmd() {
			return fechaMatClienteSmd;
		}

		public String getEstadoMaterialSmd() {
			return estadoMaterialSmd;
		}

		public String getProgramadoSmd() {
			return programadoSmd;
		}

		public String getSemanaSmd() {
			return semanaSmd;
		}

		public String getObservacionesSmd() {
			return observacionesSmd;
		}

		public String getEstadoMaterialClienteSmd() {
			return estadoMaterialClienteSmd;
		}


		public boolean isTht() {
			return tht;
		}


		public String getHorasTht() {
			return horasTht;
		}


		public String getFechaPrevMatOnaurTht() {
			return fechaPrevMatOnaurTht;
		}


		public String getEstadoMaterialOnaurTht() {
			return estadoMaterialOnaurTht;
		}


		public String getFechaMatClienteTht() {
			return fechaMatClienteTht;
		}


		public String getEstadoMaterialClienteTht() {
			return estadoMaterialClienteTht;
		}


		public String getEstadoMaterialTht() {
			return estadoMaterialTht;
		}


		public String getMaterialPreparadoTht() {
			return materialPreparadoTht;
		}


		public String getProgramadoTht() {
			return programadoTht;
		}


		public String getSemanaTht() {
			return semanaTht;
		}


		public String getObservacionesTht() {
			return observacionesTht;
		}


		public String getObservaciones() {
			return observaciones;
		}


		public void setObservaciones(String observaciones) {
			this.observaciones = observaciones;
		}


		public void setTht(boolean tht) {
			this.tht = tht;
		}


		public void setHorasTht(String horasTht) {
			this.horasTht = horasTht;
		}


		public void setFechaPrevMatOnaurTht(String fechaPrevMatOnaurTht) {
			this.fechaPrevMatOnaurTht = fechaPrevMatOnaurTht;
		}


		public void setEstadoMaterialOnaurTht(String estadoMaterialOnaurTht) {
			this.estadoMaterialOnaurTht = estadoMaterialOnaurTht;
		}


		public void setFechaMatClienteTht(String fechaMatClienteTht) {
			this.fechaMatClienteTht = fechaMatClienteTht;
		}


		public void setEstadoMaterialClienteTht(String estadoMaterialClienteTht) {
			this.estadoMaterialClienteTht = estadoMaterialClienteTht;
		}


		public void setEstadoMaterialTht(String estadoMaterialTht) {
			this.estadoMaterialTht = estadoMaterialTht;
		}


		public void setMaterialPreparadoTht(String materialPreparadoTht) {
			this.materialPreparadoTht = materialPreparadoTht;
		}


		public void setProgramadoTht(String programadoTht) {
			this.programadoTht = programadoTht;
		}


		public void setSemanaTht(String semanaTht) {
			this.semanaTht = semanaTht;
		}


		public void setObservacionesTht(String observacionesTht) {
			this.observacionesTht = observacionesTht;
		}


		public void setEstadoMaterialClienteSmd(String estadoMaterialClienteSmd) {
			this.estadoMaterialClienteSmd = estadoMaterialClienteSmd;
		}


		public void setArticulosDAO(ArticulosDAO articulosDAO) {
			this.articulosDAO = articulosDAO;
		}

		public void setArticulosList(List<ArticuloEntity> articulosList) {
			this.articulosList = articulosList;
		}

		public void setArticulosMap(Map<String, String> articulosMap) {
			this.articulosMap = articulosMap;
		}

		public void setArticulosRefMap(Map<String, String> articulosRefMap) {
			this.articulosRefMap = articulosRefMap;
		}

		public void setArticuloReferencia(String articuloReferencia) {
			this.articuloReferencia = articuloReferencia;
		}

		public void setArticuloDescripcion(String articuloDescripcion) {
			this.articuloDescripcion = articuloDescripcion;
		}

		public void setLote(String lote) {
			this.lote = lote;
		}

		public void setCantidad(String cantidad) {
			this.cantidad = cantidad;
		}

		public void setOf(String of) {
			this.of = of;
		}

		public void setFechaSolicitada(String fechaSolicitada) {
			this.fechaSolicitada = fechaSolicitada;
		}

		public void setFechaEstimada(String fechaEstimada) {
			this.fechaEstimada = fechaEstimada;
		}

		public void setPedidoConfirmado(String pedidoConfirmado) {
			this.pedidoConfirmado = pedidoConfirmado;
		}

		public void setCantidadServida(String cantidadServida) {
			this.cantidadServida = cantidadServida;
		}

		public void setFechaServida(String fechaServida) {
			this.fechaServida = fechaServida;
		}

		public void setPantalla(boolean pantalla) {
			this.pantalla = pantalla;
		}

		public void setSmd(boolean smd) {
			this.smd = smd;
		}

		public void setNumPedidoPantalla(String numPedidoPantalla) {
			this.numPedidoPantalla = numPedidoPantalla;
		}

		public void setEstadoPantalla(String estadoPantalla) {
			this.estadoPantalla = estadoPantalla;
		}

		public void setCad(String cad) {
			this.cad = cad;
		}

		public void setHorasSmd(String horas) {
			this.horasSmd = horas;
		}

		public void setFechaPrevMatOnaurSmd(String fechaPrevMatOnaurSmd) {
			this.fechaPrevMatOnaurSmd = fechaPrevMatOnaurSmd;
		}

		public void setEstadoMaterialOnaurSmd(String estadoMaterialOnaurSmd) {
			this.estadoMaterialOnaurSmd = estadoMaterialOnaurSmd;
		}

		public void setFechaMatClienteSmd(String fechaMatClientSmd) {
			this.fechaMatClienteSmd = fechaMatClientSmd;
		}

		public void setEstadoMaterialSmd(String estadoMaterialSmd) {
			this.estadoMaterialSmd = estadoMaterialSmd;
		}

		public void setProgramadoSmd(String programadoSmd) {
			this.programadoSmd = programadoSmd;
		}

		public void setSemanaSmd(String semanaSmd) {
			this.semanaSmd = semanaSmd;
		}

		public void setObservacionesSmd(String observacionesSmd) {
			this.observacionesSmd = observacionesSmd;
		}

		public void articuloDescriptionChange() {
			articuloDescripcion = articulosMap.get(articuloReferencia) ;
		}

	
}