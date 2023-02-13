package com.ikon.crud.service.in;

import com.ikon.crud.entity.UserEntity;

public interface UpdateUserUseCase {

    UserEntity updateUser(Long id, UserEntity userEntity);
}
