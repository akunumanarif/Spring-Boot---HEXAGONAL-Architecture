package com.ikon.crud.service.in;

import java.util.List;

import com.ikon.crud.entity.UserEntity;

public interface GetAllUserUseCase {
    List<UserEntity> getAllUsers();
}
