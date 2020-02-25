package com.mauricio.adapterpattern.adapter.route.controller;

import com.mauricio.adapterpattern.adapter.route.facade.UserFacade;
import com.mauricio.adapterpattern.domain.model.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1")
public class UserController {

    private UserFacade userFacade;

    @Autowired
    public UserController(UserFacade userFacade) {
        this.userFacade = userFacade;
    }

    @GetMapping( value = "/user")
    public List<UserDto> getUsers() {
        return userFacade.getAllUsers();
    }
}
