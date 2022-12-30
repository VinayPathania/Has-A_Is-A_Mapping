package com.masai;

import com.masai.exception.EmployeeException;
//import com.masai.model.Address;
//import com.masai.model.Employee;
import com.masai.service.EmployeeServiceImpl;

public class Main {
    public static void main(String[] args) throws EmployeeException {
        EmployeeServiceImpl ei = new EmployeeServiceImpl();
//        Employee emp = new Employee();
//        emp.setName("Vinay");
//        emp.setGender("Male");
//        emp.setSalary(29898998);
//        emp.getEmpAddress().add(new Address("Himachal","Nurpur","176201","Home"));
//        emp.getEmpAddress().add(new Address("Himachal","Kangra","176004","Office"));
//        System.out.println(ei.registerEmployee(emp));


//        for getting the Employee addresses by its name
        ei.getEmployeeAddressByName("Vinay");





    }
}