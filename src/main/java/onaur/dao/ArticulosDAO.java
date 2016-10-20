package onaur.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import onaur.entity.ArticuloEntity;

@Transactional
public interface ArticulosDAO extends CrudRepository<ArticuloEntity, String>{
	
	public ArticuloEntity findByReferencia(String referencia);
	public List<ArticuloEntity> findAll();

}
