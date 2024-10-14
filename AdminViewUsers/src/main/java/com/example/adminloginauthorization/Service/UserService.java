package com.example.adminloginauthorization.Service;

import com.example.adminloginauthorization.Model.Users;

import java.util.List;

public interface UserService {
    //void deleteEmployee(long id);
    List<Users> getAllEmployee();
    void deleteEmployeeByUsername(String username);
}
