package com.masai.service;

import com.masai.exception.EmployeeException;
import com.masai.model.Address;
import com.masai.model.Employee;
import com.masai.utility.EMUtil;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;
import java.util.Set;

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

    @Override
    public void getEmployeeAddressByName(String name) throws EmployeeException {
        Query q = em.createQuery("from Employee where name='"+name+"'", Employee.class);
        List<Employee> emps= q.getResultList();
        if(emps.size()>0){
            for(Employee emp: emps){
                Set<Address> addr = emp.getEmpAddress();
                for(Address ad: addr){
                    System.out.println(ad);
                }
            }
        }
        else throw new EmployeeException("Employee with given name is not present");
    }


}
