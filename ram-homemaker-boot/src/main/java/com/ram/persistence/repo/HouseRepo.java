package com.ram.persistence.repo;

import com.ram.persistence.entity.HouseEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HouseRepo extends MongoRepository<HouseEntity,String>{
	
	public HouseEntity findByHouseName(String houseName);
}
