package com.example.adminloginauthorization.Controller;

import com.example.adminloginauthorization.Model.Users;
import com.example.adminloginauthorization.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller  // Change to @Controller to render Thymeleaf template
@RequestMapping("/Employees")
public class UserController {

    @Autowired
    private UserService userService;

    // Renders the Admin page with all users passed to the view
    @GetMapping("/Admin")
    public String home(Model model) {
        List<Users> users = userService.getAllEmployee();  // Fetch all users
        model.addAttribute("users", users);  // Add users to the model
        return "Admin";  // Return the Thymeleaf template "Admin.html"
    }
}

// Keep REST API functionality for getting all employees
@RestController
@RequestMapping("/Employees")  // Correct path setup
class UserApiController {

    @Autowired
    private UserService userService;

    @GetMapping()
    public List<Users> getAllEmployee(){
        return userService.getAllEmployee();
    }

//    @DeleteMapping("{id}")
//    public ResponseEntity<String> deleteEmployee(@PathVariable("id") long id) {
//        userService.deleteEmployee(id);  // Delete employee from the database
//        return new ResponseEntity<>("Employee deleted Successfully.", HttpStatus.OK);}

//    @DeleteMapping("/{username}")
//    public ResponseEntity<String> deleteEmployeeByUsername(@PathVariable String username) {
//        userService.deleteEmployeeByUsername(username);
//        return ResponseEntity.ok("Employee deleted successfully.");
//    }

    @DeleteMapping("/{username}")
    public ResponseEntity<String> deleteEmployeeByUsername(@PathVariable String username) {
        userService.deleteEmployeeByUsername(username);  // Implement this in the service layer
        return ResponseEntity.ok("Employee deleted successfully.");
    }
}