package onaur.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import onaur.entity.SMDEntity;

public interface SmdDAO extends CrudRepository<SMDEntity, Long>{
	
	public SMDEntity findByIdLote(String idLote);
	public List<SMDEntity> findAll();

}
