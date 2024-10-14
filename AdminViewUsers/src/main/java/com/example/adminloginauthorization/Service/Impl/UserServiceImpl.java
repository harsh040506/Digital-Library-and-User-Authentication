package com.example.adminloginauthorization.Service.Impl;

import com.example.adminloginauthorization.Model.Users;
import com.example.adminloginauthorization.Repository.UserRepository;
import com.example.adminloginauthorization.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<Users> getAllEmployee() {
        return userRepository.findAll();
    }

    /*@Override
    public void deleteEmployee(long id) {
        userRepository.findById(id).orElseThrow(RuntimeException::new);
        userRepository.deleteById(id);
    }*/

    @Override
    public void deleteEmployeeByUsername(String username) {
        userRepository.findByUsername(username).orElseThrow(RuntimeException::new);
        userRepository.deleteByUsername(username);
    }
}