package com.mauricio.adapterpattern.adapter.mongo_repository;

import com.mauricio.adapterpattern.domain.model.UserDto;
import com.mauricio.adapterpattern.domain.repository.Repository;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Repository
public class RepositoryImp implements Repository {

    @Override
    public List<UserDto> findAllUser() {
        /**
         * Implements here logic for search in mongodb
         */
        List<UserDto> userEntities = new ArrayList<>();
        userEntities.add(new UserDto("Mauricio",27,"1"));
        userEntities.add(new UserDto("Juana",  85,"2"));
        return userEntities;
    }
}
