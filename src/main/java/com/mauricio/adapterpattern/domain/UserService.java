package com.mauricio.adapterpattern.domain;

import com.mauricio.adapterpattern.domain.cache.CacheRepository;
import com.mauricio.adapterpattern.domain.model.UserDto;
import com.mauricio.adapterpattern.domain.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;

@Service
public class UserService {
    private Repository repository;
    private CacheRepository cacheRepository;

    @Autowired
    public UserService(Repository repository, CacheRepository cacheRepository) {
        this.repository = repository;
        this.cacheRepository = cacheRepository;
    }

    public List<UserDto> getAllUsers() {
        /**
         * Implements here business logic if it is necessary
         */

        List<UserDto> listUsers = repository.findAllUser();

        Map<String, String> userCategories = cacheRepository.getUserCategories();

        //Map category for each user
        listUsers.forEach(userDto -> {
            userDto.setCategory(userCategories.get(userDto.getTypeUser()));
        });

        return listUsers;
    }
}
