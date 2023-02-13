package com.ikon.crud.service;

import org.springframework.stereotype.Service;

import com.ikon.crud.entity.UserEntity;
import com.ikon.crud.service.in.UpdateUserUseCase;
import com.ikon.crud.service.out.UpdateUserPort;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UpdateUserService implements UpdateUserUseCase {

    private final UpdateUserPort updateUserPort;

    @Override
    public UserEntity updateUser(Long id, UserEntity userEntity) {

        return updateUserPort.updateUser(id, userEntity);
    }

}
