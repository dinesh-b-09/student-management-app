package com.example.studentmanagementapp;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentRepository
{
    Map<Integer,Student> db = new HashMap<>();



    public Student getStudent(int regNo)
    {
        return db.get(regNo);
    }

    public void addStudent(Student student)
    {
        db.put(student.getRegNo(),student);
    }

    public Student getStudentUsingPath(int regNo)
    {
        return db.get(regNo);
    }

    public Student updateAge(int regNo, int newAge)
    {
        db.get(regNo).setAge(newAge);
        return db.get(regNo);
    }

    public Student updateCourse(int regNo, String newCourse)
    {
        db.get(regNo).setCourse(newCourse);
        return db.get(regNo);
    }

    public Student updateCourseBypath(int regNo, String newCourse)
    {
        db.get(regNo).setCourse(newCourse);
        return db.get(regNo);
    }

    public Student changeCourse(int regNo, String newCourse)
    {
        db.get(regNo).setCourse(newCourse);
        return db.get(regNo);
    }

    public Student changeCourseAge(int regNo, Student student)
    {
//        db.get(regNo).setCourse();
        db.put(student.getRegNo(),student);
        return db.get(regNo);
    }

    public void deleteStudentbyparam(int regNo)
    {
        db.remove(regNo);
    }

    public void deletebypath(int regNo)
    {
        db.remove(regNo);
    }
}
