package com.ikon.crud.adapter.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ikon.crud.entity.UserEntity;
import com.ikon.crud.service.in.GetAllUserUseCase;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api/v1/users")
@RequiredArgsConstructor
public class GetAllUserController {

    private final GetAllUserUseCase getAllUserUseCase;

    @GetMapping
    public List<UserEntity> getAllUsers() {
        return getAllUserUseCase.getAllUsers();
    }

}
