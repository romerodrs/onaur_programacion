package onaur.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import onaur.entity.SemanasEntity;

public interface SemanasDAO extends CrudRepository<SemanasEntity, Long>{
	
	public SemanasEntity findById(String id);
	public List<SemanasEntity> findAll();

}
