package onaur.controller;

import java.io.FileReader;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.opencsv.CSVReader;

import onaur.dao.ArticulosDAO;
import onaur.entity.ArticuloEntity;


@RestController
public class WebseviceRestController {


	@Autowired
	private ArticulosDAO articulosDao;

	@RequestMapping("/loadCSV")
	@ResponseBody
	public String loadCSV() {
		try (CSVReader reader = new CSVReader(new FileReader("../onaur_programacion/LISTADO_ARTICULOS.csv"));){
			List<String[]> csvRows = reader.readAll();
			ArticuloEntity articulosEntity;
			for(String[] row : csvRows){
				String rowSplitted[] = row[0].split(";");
				articulosEntity = new ArticuloEntity();
				articulosEntity.setReferencia(rowSplitted[0]);
				articulosEntity.setArticulo(rowSplitted[1]);
				System.out.println(articulosEntity.toString());
				articulosDao.save(articulosEntity);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		return "Done";
	}
}
