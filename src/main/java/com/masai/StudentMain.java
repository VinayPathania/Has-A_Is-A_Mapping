package com.masai;

import com.masai.exception.StudentException;
import com.masai.model.Student;
import com.masai.service.StudentServiceImpl;

import java.util.List;

public class StudentMain {
    public static void main(String[] args) throws StudentException {
        StudentServiceImpl si = new StudentServiceImpl();
//        Student std2 = new Student("Raghav","Male","Himachal",200);
//        System.out.println(si.registerStudent(std2));

//        List<Student> std = si.getStudentByAddress("Shimla");
//        for(Student st:std){
//            System.out.println(st);
//        }


//        List<Student> std = si.getAllStudentWithRangeMarks(100,150);
//        for(Student st:std){
//            System.out.println(st);
//        }


//        System.out.println(si.getStudentNameAndMarks(2));
    }
}
