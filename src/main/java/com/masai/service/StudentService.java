package com.masai.service;


import com.masai.exception.StudentException;
import com.masai.model.Student;

import java.util.List;

public interface StudentService {

    Student registerStudent(Student std) throws StudentException;

    List<Student> getAllStudents() throws StudentException;
    List<Student> getStudentByAddress(String address) throws StudentException;
    List<Student> getAllStudentWithRangeMarks(int startMarks,int endMarks) throws StudentException;
    String getStudentNameAndMarks(int empId)throws StudentException;
    int getStudentMarksById(int empId)throws StudentException;

}
