package onaur.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import onaur.entity.ReparacionesEntity;

public interface ReparacionesDAO extends CrudRepository<ReparacionesEntity, Long>{
	
	public ReparacionesEntity findById(String id);
	public List<ReparacionesEntity> findAll();

}
