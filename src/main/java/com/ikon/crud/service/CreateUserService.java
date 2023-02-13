package com.ikon.crud.service;

import org.springframework.stereotype.Service;

import com.ikon.crud.entity.UserEntity;
import com.ikon.crud.service.in.CreateUserUseCase;
import com.ikon.crud.service.out.CreateUserPort;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CreateUserService implements CreateUserUseCase {

    private final CreateUserPort createUserPort;

    @Override
    public UserEntity createUser(UserEntity userEntity) {
        return createUserPort.createUser(userEntity);
    }

}
