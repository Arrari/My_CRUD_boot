package com.example.my_crud_boot.repository;

import com.example.my_crud_boot.model.User;

import java.util.List;

public interface UserRepository {
    public List<User> getAllUsers();
    public User getUserById(int id);
    public void addUser(User user);
    public void updateUser(User user);
    public void deleteUserById(int id);
}
