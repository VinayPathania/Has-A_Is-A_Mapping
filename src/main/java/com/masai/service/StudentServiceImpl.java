package com.masai.service;

import com.masai.exception.StudentException;
import com.masai.model.Student;
import com.masai.utility.EMUtil;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class StudentServiceImpl implements StudentService{

    EntityManager em = EMUtil.provideEntityManager();

    @Override
    public Student registerStudent(Student std) throws StudentException {
        if(std!=null){
            em.getTransaction().begin();
            em.persist(std);
            em.getTransaction().commit();
            em.close();
            return std;
        }
        else throw new StudentException("Please provide correct Employee details");
    }


    @Override
    public List<Student> getAllStudents() throws StudentException {
        Query q = em.createQuery("from Student");
        List<Student> stds = q.getResultList();
        if(stds.size()>0){
            return stds;
        }
        else throw new StudentException("No Student present in the table");
    }

    @Override
    public List<Student> getStudentByAddress(String address) throws StudentException {
        Query q = em.createQuery("from Student where address ='"+address+"'");
        List<Student> stds = q.getResultList();
        if(stds.size()>0){
            return stds;
        }
        else throw new StudentException("Given address is not present");
    }

    @Override
    public List<Student> getAllStudentWithRangeMarks(int startMarks, int endMarks) throws StudentException {
        Query q = em.createQuery("from Student where marks between "+startMarks+"and "+endMarks+"");
        List<Student> stds = q.getResultList();
        if(stds.size()>0){
            return stds;
        }
        else throw new StudentException("No student present in the range of given marks");
    }

    @Override
    public String getStudentNameAndMarks(int empId) throws StudentException {
        Student std = em.find(Student.class,empId);
        if(std!=null){
            System.out.println(std.getName());
            System.out.println(std.getMarks());
            return "done";
        }
        else throw new StudentException("Given id is not present");
    }

    @Override
    public int getStudentMarksById(int empId) throws StudentException {
        Student std = em.find(Student.class,empId);
        if(std!=null){
            return std.getMarks();
        }
        else throw new StudentException("Given id is not present");
    }
}
