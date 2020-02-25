package com.mauricio.adapterpattern.adapter.mongo_repository;

import com.mauricio.adapterpattern.adapter.mongo_repository.entity.UserEntity;
import com.mauricio.adapterpattern.domain.model.UserDto;
import com.mauricio.adapterpattern.domain.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Repository
public class RepositoryImp implements Repository {
    @Autowired
    MongoRepoUser mongoRepoUser;

    @Override
    public List<UserDto> findAllUser() {
        /**
         * Implements here logic for search in mongodb
         */
        List<UserDto> userEntities = new ArrayList<>();
        // Map from UserEntity (mongo) to UserDTO (required by interface Repository)
        mongoRepoUser.findAll().forEach(user->{
            userEntities.add(new UserDto(user.getNombre()+user.getApellido(),user.getEdad(),user.getTipoUsuario()+""));
        });
        return userEntities;
    }
}
