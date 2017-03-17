package com.yb.service;

import com.yb.model.Student;

import java.util.List;

/**
 * Created by 杨波 on 2017/3/14.
 */
public interface StudentService {


   List<Student> getAllStudent();

   void deleteStudent(Integer integer);
//
   Student getStudent(Integer integer);
//
   void updateStudent(Student student);
//
   void addStudent(Student student);

   Student getStudentByNumber(Integer number);

}
