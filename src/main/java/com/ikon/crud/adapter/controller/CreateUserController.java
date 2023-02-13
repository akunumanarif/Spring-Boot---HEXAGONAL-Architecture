package com.ikon.crud.adapter.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ikon.crud.entity.UserEntity;
import com.ikon.crud.service.in.CreateUserUseCase;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class CreateUserController {

    private final CreateUserUseCase createUserUseCase;

    @PostMapping
    public UserEntity createUser(@RequestBody UserEntity userEntity) {
        return createUserUseCase.createUser(userEntity);
    }
}
