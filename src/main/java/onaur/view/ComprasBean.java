package onaur.view;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import onaur.dao.ComprasDAO;
import onaur.entity.ComprasEntity;

@Component("compras")
public class ComprasBean implements Serializable{

	@Autowired
	private ComprasDAO comprasDao;
	
	private List<ComprasEntity> compraslist;
	
	@PostConstruct
    public void init() {
		compraslist = comprasDao.findAll();
    }

	public List<ComprasEntity> getCompraslist() {
		return compraslist;
	}

	
	
	
}