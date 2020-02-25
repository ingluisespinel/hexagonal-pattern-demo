package com.mauricio.adapterpattern.domain.repository;

import com.mauricio.adapterpattern.domain.model.UserDto;

import java.util.List;

public interface Repository {

    List<UserDto> findAllUser();
}
