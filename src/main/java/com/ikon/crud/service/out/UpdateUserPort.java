package com.ikon.crud.service.out;

import com.ikon.crud.entity.UserEntity;

public interface UpdateUserPort {
    UserEntity updateUser(Long id, UserEntity userEntity);
}
