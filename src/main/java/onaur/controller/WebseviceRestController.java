package onaur.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import onaur.dao.ArticulosDAO;
import onaur.dao.ComprasDAO;
import onaur.dao.LotesDAO;
import onaur.dao.SmdDAO;
import onaur.dao.ThtDAO;
import onaur.entity.ArticuloEntity;
import onaur.entity.ComprasEntity;
import onaur.entity.LotesEntity;
import onaur.entity.SMDEntity;
import onaur.entity.THTEntity;
import onaur.pojo.Articulo;
import onaur.pojo.Compras;
import onaur.pojo.Lotes;
import onaur.pojo.THT;
import onaur.pojo.SMD;


@RestController
public class WebseviceRestController {

	@Autowired
	private ArticulosDAO articulosDao;
	@Autowired
	private ComprasDAO comprasDao;
	@Autowired
	private SmdDAO smdDao;
	@Autowired
	private ThtDAO thtDao;
	@Autowired
	private LotesDAO lotesDao;
	@Autowired
	private CSVLoader csvLoader;
	
	@RequestMapping("/loadCSV")
	@ResponseBody
	public String loadCSV() {
		String size = "no_size";
		try{
			csvLoader.load();
			List<Compras> comprasList = csvLoader.getComprasList();
			List<THT> thtList = csvLoader.getConvList();
			List<SMD> smdList = csvLoader.getSmdList();
			List<Lotes> lotesList = csvLoader.getLotesList();
			List<Articulo> articulosList = csvLoader.getArticulosList();
			
			size = "compras: "+ comprasList.size() + "tht: "+ thtList.size() + "smd: " + smdList.size() + "lotes: " + lotesList.size();
			
			ArticuloEntity articulosEntity;
			LotesEntity lotesEntity;
			SMDEntity smdEntity;
			THTEntity thtEntity;
			ComprasEntity comprasEntity;
			
			for(Articulo articulo : articulosList){
				articulosEntity = new ArticuloEntity();
				articulosEntity.setReferencia(articulo.getReferencia());
				articulosEntity.setArticulo(articulo.getArticulo());
				articulosDao.save(articulosEntity);
			}
			for(Compras compras : comprasList){
				Lotes lotes = new Lotes(compras.getReferencia(), compras.getLote());
				lotesEntity = new LotesEntity();
				lotesEntity.setIdLote(lotes.getIdLote());
				lotesEntity.setLote(lotes.getLote());
				lotesEntity.setReferencia(lotes.getReferencia());
				lotesDao.save(lotesEntity);
				
				comprasEntity = new ComprasEntity();
				comprasEntity.setFecha_solicitud(compras.getFecha_solicitud());
				comprasEntity.setFecha_confirmacion(compras.getFecha_confirmacion());
				comprasEntity.setOF(compras.getOF());
				comprasEntity.setId_lote(lotes.getIdLote());
				comprasEntity.setCantidad(compras.getCantidad());
				comprasEntity.setObservaciones(compras.getObservaciones());

				
				for(THT tht : thtList){
					if((tht.getReferencia().equals(compras.getReferencia())) && (tht.getLote().equals(compras.getLote()))){
						thtEntity = new THTEntity();
						thtEntity.setId_lote(lotes.getIdLote());
						thtEntity.setEstado_material_onaur(compras.getEstado_mat_onaur_tht());
						thtEntity.setFecha_prev_material_onaur(compras.getFecha_entrega_mat_cliente_tht());
						thtEntity.setEstado_material_cliente(compras.getEstado_mat_cliente_tht());
						thtEntity.setFecha_prev_material_cliente(compras.getFecha_entrega_mat_cliente_tht());
						thtEntity.setEstado_material(compras.getEstado_conv());
						thtEntity.setTiempo(compras.getTiempo_conv());
						thtEntity.setProgramado_tht(compras.getProgramado_conv());
						thtEntity.setObservaciones(compras.getObservaciones());
						thtEntity.setSemana(" "); //TODO
//						System.out.println("********* " + thtEntity.toString());
						thtDao.save(thtEntity);
						
						comprasEntity.setCantidad_servida(tht.getServido());
						comprasEntity.setFecha_servida(" ");
					}
				}
				
				for(SMD smd : smdList){
					if((smd.getReferencia().equals(compras.getReferencia())) && (smd.getLote().equals(compras.getLote()))){
						smdEntity = new SMDEntity();
						String pantalla;
						String pantalla_estado;
						smdEntity.setSemana(smd.getSemana());
						smdEntity.setId_lote(lotes.getIdLote());
						smdEntity.setCAD(compras.getCAD_smd());
						smdEntity.setEstado_material_onaur(compras.getEstado_mat_onaur_smd());
						smdEntity.setFecha_prev_material_onaur(compras.getFecha_entrega_mat_onaur_smd());
						smdEntity.setEstado_material_cliente(compras.getEstado_mat_cliente_smd());
						smdEntity.setFecha_prev_material_cliente(compras.getFecha_prev_mat_onaur_smd());
						if(compras.getPantalla_smd().equals("*")){
							pantalla = "N";
							pantalla_estado = " ";
						}else{
							pantalla = "S";
							pantalla_estado = compras.getPantalla_smd();
						}
						smdEntity.setPantalla(pantalla);
						smdEntity.setPantalla_estado(pantalla_estado);
						smdEntity.setEstado(compras.getEstado_smd());
						smdEntity.setTiempo(compras.getTiempo_smd());
						smdEntity.setProgramado_smd(compras.getProgramado_smd());
						smdEntity.setObservaciones(smd.getObservaciones());
//						System.out.println("********* " + smd.toString());
//						System.out.println("********* " + smdEntity.toString());
						smdDao.save(smdEntity);
					}
				}
				comprasDao.save(comprasEntity);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "CSV Loaded! " + size ;
	}
	
	@RequestMapping(value="/loadCompras", method = RequestMethod.GET, headers="Accept=application/json")
	@ResponseBody
	private List<ComprasEntity> loadCompras(){
		return comprasDao.findAll();
	}
	
	@RequestMapping(value="/loadSMD", method = RequestMethod.GET, headers="Accept=application/json")
	@ResponseBody
	private List<SMDEntity> loadSMD(){
		return smdDao.findAll();
	}
	
	@RequestMapping(value="/loadTHT", method = RequestMethod.GET, headers="Accept=application/json")
	@ResponseBody
	private List<THTEntity> loadTHT(){
		return thtDao.findAll();
	}
}
