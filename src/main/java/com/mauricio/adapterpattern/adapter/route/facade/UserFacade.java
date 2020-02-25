package com.mauricio.adapterpattern.adapter.route.facade;

import com.mauricio.adapterpattern.domain.UserService;
import com.mauricio.adapterpattern.domain.model.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserFacade {
    private UserService userService;

    @Autowired
    public UserFacade(UserService userService) {
        this.userService = userService;
    }

    public List<UserDto> getAllUsers() {
        /**
         * Add here pre-validations rules
         */
        return userService.getAllUsers();
    }
}
