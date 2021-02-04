package com.qfedu.service;

import com.qfedu.entity.User;

public interface UserService {
    public User findUserById(String id);

    public int updateUser(User user);
}
