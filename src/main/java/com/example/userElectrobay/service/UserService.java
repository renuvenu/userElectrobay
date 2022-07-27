package com.example.userElectrobay.service;

import com.example.userElectrobay.entity.User;


public interface UserService {
    User getUser(int id);
    User save (User user);
    void  delete(int id);

}
