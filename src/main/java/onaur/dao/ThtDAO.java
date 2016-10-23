package onaur.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import onaur.entity.THTEntity;

public interface ThtDAO extends CrudRepository<THTEntity, Long>{
	
	public THTEntity findByIdLote(String idLote);
	public List<THTEntity> findAll();

}
