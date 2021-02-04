package com.qfedu.service.impl;

import com.qfedu.dao.UserDao;
import com.qfedu.dao.impl.UserDaoImpl;
import com.qfedu.entity.User;
import com.qfedu.service.UserService;

public class UserServiceImpl implements UserService {

    UserDao userDao = new UserDaoImpl();
    @Override
    public User findUserById(String id) {
        return userDao.findUserById(id);
    }

    @Override
    public int updateUser(User user) {
        return userDao.updateUser(user);
    }
}
