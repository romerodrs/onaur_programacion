package onaur.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import onaur.entity.ArticuloEntity;

public interface ArticulosDAO extends CrudRepository<ArticuloEntity, Long>{
	
	public ArticuloEntity findByReferencia(String referencia);
	public List<ArticuloEntity> findAll();
	public List<ArticuloEntity> findAllByOrderByReferenciaAsc();

}
