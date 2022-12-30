package com.masai.service;

import com.masai.exception.EmployeeException;
import com.masai.model.Employee;
import com.masai.utility.EMUtil;

import javax.persistence.EntityManager;

public class EmployeeServiceImpl implements EmployeeService{

    EntityManager em = EMUtil.provideEntityManager();
    @Override
    public Employee registerEmployee(Employee employee) throws EmployeeException {
        if(employee!=null){
            em.getTransaction().begin();
            em.persist(employee);
            em.getTransaction().commit();
            em.close();
            return employee;
        }
        else throw new EmployeeException("Please provide the correct details");
    }
}
