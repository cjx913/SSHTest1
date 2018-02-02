package com.cjx913.ssh.service;

import com.cjx913.ssh.entity.User;

import java.util.List;

public interface UserService {
    public void saveUser(User user);
    public void updateUser(User user);
    public void deleteUser(User user);
    public User findUserById(Integer id);
    public List<User> findAllUser();
    public User findUserByNameAndPassword(User user);
}
