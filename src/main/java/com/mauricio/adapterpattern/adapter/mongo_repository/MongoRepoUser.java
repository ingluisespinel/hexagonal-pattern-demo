package com.mauricio.adapterpattern.adapter.mongo_repository;

import com.mauricio.adapterpattern.adapter.mongo_repository.entity.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MongoRepoUser extends MongoRepository<UserEntity,String> {
}
