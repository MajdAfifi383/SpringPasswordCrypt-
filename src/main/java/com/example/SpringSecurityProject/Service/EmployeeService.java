package com.example.SpringSecurityProject.Service;

import com.example.SpringSecurityProject.DTO.EmployeeDTO;
import com.example.SpringSecurityProject.DTO.LoginDTO;
import com.example.SpringSecurityProject.Response.LoginResponse;

public interface EmployeeService {
    String addEmployee(EmployeeDTO employeeDTO);

    LoginResponse loginEmployee(LoginDTO loginDTO);
}
