package com.cds.learn.dao;

import com.cds.learn.entity.Student;

import java.util.Collection;

/**
 * Created by cds on 2/9/17 23:13.
 */
public interface StudentDao {
    Collection<Student> getAllStudents();

    Student getStudentById(int id);

    void removeStudentById(int id);

    void updateStudent(Student student);

    void insertStudentToDb(Student student);
}
