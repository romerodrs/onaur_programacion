package onaur.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import onaur.entity.LotesEntity;

public interface LotesDAO extends CrudRepository<LotesEntity, Long>{
	
	public LotesEntity findByIdLote(String idLote);
	public List<LotesEntity> findAll();

}
