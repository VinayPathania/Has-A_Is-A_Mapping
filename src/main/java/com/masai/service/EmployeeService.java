package com.masai.service;

import com.masai.exception.EmployeeException;
import com.masai.model.Employee;

public interface EmployeeService {
    public Employee registerEmployee(Employee employee)throws EmployeeException;
}
