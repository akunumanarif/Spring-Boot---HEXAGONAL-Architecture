package com.ikon.crud.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ikon.crud.entity.UserEntity;
import com.ikon.crud.service.in.GetAllUserUseCase;
import com.ikon.crud.service.out.GetAllUserPort;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class GetAllUserService implements GetAllUserUseCase {

    private final GetAllUserPort getAllUserPort;

    @Override
    public List<UserEntity> getAllUsers() {

        return getAllUserPort.getAllUsers();
    }

}
