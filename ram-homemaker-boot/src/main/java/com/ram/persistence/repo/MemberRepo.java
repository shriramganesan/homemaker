package com.ram.persistence.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ram.persistence.entity.MemberEntity;

@Repository
public interface MemberRepo extends MongoRepository<MemberEntity, String>{

}
