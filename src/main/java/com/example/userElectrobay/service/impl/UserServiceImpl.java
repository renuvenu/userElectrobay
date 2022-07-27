package com.example.userElectrobay.service.impl;

import com.example.userElectrobay.entity.User;
import com.example.userElectrobay.repository.UserRepository;
import com.example.userElectrobay.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;


    @Override
    public User getUser(int id) {
        Optional<User>  optionalUser=userRepository.findById(id);
        return optionalUser.isPresent()?optionalUser.get():null;

    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public void delete(int id) {
        userRepository.deleteById(id);
    }
}
