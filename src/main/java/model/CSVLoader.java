package model;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;

import pojo.Articulo;
import pojo.Compras;
import pojo.Convencional;
import pojo.SMD;

public class CSVLoader {

	private List<Articulo> articulosList;
	private List<Compras> comprasList;
	private List <Convencional> convList;
	private List<SMD> smdList;

	public void load() throws IOException{
		this.loadArticulos();
		this.loadCompras();
		this.loadConvencional();
		this.loadSMD();
	}

	private void loadArticulos() throws IOException{
		List<String[]> csvRows = loadCSV("../onaur_programacion/LISTADO_ARTICULOS.csv");
		articulosList = new ArrayList<Articulo>();
		for(String[] row : csvRows){
			String rowSplitted[] = row[0].split(";");
			Articulo articulo = new Articulo();
			articulo.setReferencia(rowSplitted[0]);
			articulo.setArticulo(rowSplitted[1]);
			articulosList.add(articulo);
		}
		System.out.println("ARTICULOS: " + articulosList.size());
	}

	private void loadCompras() throws IOException{
		List<String[]> csvRows = loadCSV("../onaur_programacion/COMPRAS.csv");
		comprasList = new ArrayList<Compras>();
		for(String[] row : csvRows){
			String rowToSplit[] = row[0].split(";");
			Compras compras = new Compras();
			compras.setFecha_solicitud(rowToSplit[0]);
			compras.setFecha_confirmacion(rowToSplit[1]);
			compras.setOF(rowToSplit[2]);
			compras.setReferencia(rowToSplit[3]);
			compras.setLote(rowToSplit[4]);
			compras.setArticulo(rowToSplit[5]);
			compras.setCantidad(rowToSplit[6]);
			compras.setEstado_mat_onaur_smd(rowToSplit[7]);
			compras.setFecha_prev_mat_onaur_smd(rowToSplit[8]);
			compras.setEstado_mat_cliente_smd(rowToSplit[9]);
			compras.setFecha_entrega_mat_onaur_smd(rowToSplit[10]);
			compras.setPantalla_smd(rowToSplit[11]);
			compras.setCAD_smd(rowToSplit[12]);
			compras.setEstado_smd(rowToSplit[13]);
			compras.setTiempo_smd(rowToSplit[14]);
			compras.setProgramado_smd(rowToSplit[15]);
			compras.setEstado_mat_onaur_conv(rowToSplit[16]);
			compras.setFecha_prev_mat_onaur_conv(rowToSplit[17]);
			compras.setEstado_mat_cliente_conv(rowToSplit[18]);
			compras.setFecha_entrega_mat_onaur_conv(rowToSplit[19]);
			compras.setEstado_conv(rowToSplit[20]);
			compras.setTiempo_conv(rowToSplit[21]);
			compras.setProgramado_conv(rowToSplit[22]);
			compras.setObservaciones(rowToSplit[23]);
			comprasList.add(compras);
		}
		System.out.println("COMPRAS: " + comprasList.size());
	}

	private void loadConvencional() throws IOException{
		List<String[]> csvRows = loadCSV("../onaur_programacion/CONVENCIONAL.csv");
		convList = new ArrayList<Convencional>();
		for(String[] row : csvRows){
			String rowSplitted[] = row[0].split(";");
			Convencional conv = new Convencional();
			conv.setFecha_entrega(rowSplitted[0]);
			conv.setPreparado(rowSplitted[1]);
			conv.setSMD(rowSplitted[2]);
			conv.setReferencia(rowSplitted[3]);
			conv.setLote(rowSplitted[4]);
			conv.setArticulo(rowSplitted[5]);
			conv.setCantidad(rowSplitted[6]);
			conv.setServido(rowSplitted[7]);
			conv.setPendiente(rowSplitted[8]);
			conv.setHoras(rowSplitted[9]);
			conv.setPrioridad(rowSplitted[10]);
			conv.setObservaciones(rowSplitted[11]);
			convList.add(conv);
		}
		System.out.println("CONVENCIONAL: " + convList.size());
	}


	private void loadSMD() throws IOException {
		List<String[]> csvRows = loadCSV("../onaur_programacion/SMD.csv");
		smdList = new ArrayList<SMD>();
		String semana = "";
		for(String[] row : csvRows){
			String rowSplitted[] = row[0].split(";");
			SMD smd = new SMD();
			if (((rowSplitted[0].contains("non_value")) || (rowSplitted[0].contains("DEL")))  && (!rowSplitted[1].contains("non_value"))){
				semana = rowSplitted[1];
			}
			if ((!rowSplitted[0].contains("non_value")) && (rowSplitted[1].contains("non_value"))){
				smd.setFecha_entrega(rowSplitted[0]);
				smd.setSemana(semana);
				smd.setConvencional(rowSplitted[2]);
				smd.setReferencia(rowSplitted[3]);
				smd.setLote(rowSplitted[4]);
				smd.setArticulo(rowSplitted[5]);
				smd.setCantidad(rowSplitted[6]);
				smd.setCAD_intro(rowSplitted[7]);
				smd.setCAD_mod(rowSplitted[8]);
				smd.setHoras(rowSplitted[9]);
				smd.setObservaciones(rowSplitted[11]);
				smdList.add(smd);
			}
		}
		System.out.println("SMD: " + smdList.size());
	}

	private List<String[]> loadCSV(String fileName) throws FileNotFoundException, IOException {
		CSVReader reader = new CSVReader(new FileReader(fileName));
		List<String[]> csvRows = reader.readAll();
		reader.close();
		return csvRows;
	}


}
