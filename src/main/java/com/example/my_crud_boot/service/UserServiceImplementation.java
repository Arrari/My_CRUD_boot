package com.example.my_crud_boot.service;

import com.example.my_crud_boot.model.User;
import com.example.my_crud_boot.repository.UserRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class UserServiceImplementation implements UserService{


    private final UserRepository userRepository;

    @Autowired
    public UserServiceImplementation(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

    @Override
    @Transactional(readOnly = true)
    public User getUserById(int id) {
        return userRepository.getUserById(id);
    }

    @Override
    public void addUser(User user) {
        userRepository.addUser(user);
    }

    @Override
    public void updateUser(User user) {
        userRepository.updateUser(user);
    }

    @Override
    public void deleteUserById(int id) {
        userRepository.deleteUserById(id);
    }
}
