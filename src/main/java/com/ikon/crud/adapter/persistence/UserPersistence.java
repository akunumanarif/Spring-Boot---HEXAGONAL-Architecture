package com.ikon.crud.adapter.persistence;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ikon.crud.entity.UserEntity;
import com.ikon.crud.service.out.CreateUserPort;
import com.ikon.crud.service.out.GetAllUserPort;
import com.ikon.crud.service.out.UpdateUserPort;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor

public class UserPersistence implements CreateUserPort, GetAllUserPort, UpdateUserPort {

    private final UserRepository userRepository;

    @Override
    public UserEntity updateUser(Long id, UserEntity userEntity) {
        userEntity.setId(id);
        return userRepository.save(userEntity);
    }

    @Override
    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public UserEntity createUser(UserEntity userEntity) {
        return userRepository.save(userEntity);
    }

}
