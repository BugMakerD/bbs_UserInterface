package com.qfedu.dao;

import com.qfedu.entity.User;

public interface UserDao {

     User findUserById(String id);

     int updateUser(User user);
}

