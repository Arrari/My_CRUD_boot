package com.example.my_crud_boot.service;

import com.example.my_crud_boot.model.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUsers();
    public User getUserById(int id);
    public void addUser(User user);
    public void updateUser(User user);
    public void deleteUserById(int id);
}
