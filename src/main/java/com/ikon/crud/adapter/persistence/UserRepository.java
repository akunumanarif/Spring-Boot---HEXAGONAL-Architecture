package com.ikon.crud.adapter.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ikon.crud.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
