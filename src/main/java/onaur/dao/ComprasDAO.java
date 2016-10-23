package onaur.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import onaur.entity.ComprasEntity;

public interface ComprasDAO extends CrudRepository<ComprasEntity, Long>{
	
	public ComprasEntity findByIdLote(String idLote);
	public List<ComprasEntity> findAll();

}
