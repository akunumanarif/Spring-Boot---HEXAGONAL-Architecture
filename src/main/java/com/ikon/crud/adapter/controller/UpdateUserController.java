package com.ikon.crud.adapter.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ikon.crud.entity.UserEntity;
import com.ikon.crud.service.in.UpdateUserUseCase;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api/v1/users")
@RequiredArgsConstructor
public class UpdateUserController {

    private final UpdateUserUseCase updateUserUseCase;

    @PutMapping("/{id}")
    public UserEntity updateUser(@PathVariable("id") Long id, @RequestBody UserEntity userEntity) {
        return updateUserUseCase.updateUser(id, userEntity);
    }

}
