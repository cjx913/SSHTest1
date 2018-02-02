package com.cjx913.ssh.service.impl;

import com.cjx913.ssh.dao.UserDao;
import com.cjx913.ssh.entity.User;
import com.cjx913.ssh.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void saveUser(User user) {
        userDao.saveUser(user);
    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    @Override
    public void deleteUser(User user) {
        userDao.deleteUser(user);
    }

    @Override
    public User findUserById(Integer id) {
        return userDao.findUserById(id);
    }

    @Override
    public List <User> findAllUser() {
        return userDao.findAllUser();
    }

    @Override
    public User findUserByNameAndPassword(User user) {
        return userDao.findUserByNameAndPassword(user);
    }
}
