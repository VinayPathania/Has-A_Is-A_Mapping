package com.masai.service;

import com.masai.exception.EmployeeException;
import com.masai.model.Employee;

import java.util.List;

public interface EmployeeService {
    public Employee registerEmployee(Employee employee)throws EmployeeException;
    public void getEmployeeAddressByName(String name)throws EmployeeException;
}
