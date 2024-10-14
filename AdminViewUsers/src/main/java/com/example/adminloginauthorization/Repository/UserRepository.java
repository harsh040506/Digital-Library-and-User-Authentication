package com.example.adminloginauthorization.Repository;

import com.example.adminloginauthorization.Model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users,Long> {

    ScopedValue<Object> findByUsername(String username);
    void deleteByUsername(String username);
}