package com.ikon.crud.service.in;

import com.ikon.crud.entity.UserEntity;

public interface CreateUserUseCase {

    UserEntity createUser(UserEntity userEntity);
}
