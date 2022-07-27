package com.example.userElectrobay.repository;

import com.example.userElectrobay.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer> {
}
