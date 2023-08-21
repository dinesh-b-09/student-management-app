package com.example.studentmanagementapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService
{
    @Autowired
    StudentRepository studentRepository;

    public Student getStudent(int regNo)
    {
        return studentRepository.getStudent(regNo);
    }

    public String addStudent(Student student)
    {
        studentRepository.addStudent(student);
        return "student added";
    }

    public Student getStudentUsingPath(int regNo)
    {
        return studentRepository.getStudentUsingPath(regNo);
    }

    public Student updateAge(int regNo, int newAge)
    {
        return studentRepository.updateAge(regNo,newAge);
    }

    public Student updateCourse(int regNo, String newCourse)
    {
        return studentRepository.updateCourse(regNo, newCourse);
    }


    public Student updateCourseBypath(int regNo, String newCourse)
    {
        return studentRepository.updateCourseBypath(regNo, newCourse);
    }

    public Student changeCourse(int regNo, String newCourse)
    {
        return studentRepository.changeCourse(regNo, newCourse);
    }

    public Student changeCourseAge(int regNo, Student student)
    {
        return studentRepository.changeCourseAge(regNo, student);
    }

    public String deleteStudentbyparam(int regNo)
    {
        studentRepository.deleteStudentbyparam(regNo);
        return "student deleted";
    }

    public String deletebypath(int regNo)
    {
        studentRepository.deletebypath(regNo);
        return "student deleted successfully";
    }
}
