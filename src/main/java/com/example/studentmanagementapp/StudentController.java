package com.example.studentmanagementapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController
{

    @Autowired
    StudentService studentService;

    @GetMapping("/get")
    public Student getStudent(@RequestParam("id") int regNo)
    {
        return studentService.getStudent(regNo);
    }
    @PostMapping("/add")
    public String addStudent(@RequestBody Student student)
    {
        return studentService.addStudent(student);
    }
    @GetMapping("/getpath/{id}")
    public Student getStudentUsingPath(@PathVariable("id") int regNo)
    {
        return studentService.getStudentUsingPath(regNo);
    }

    @PutMapping("/update-age")
    public Student updateAge(@RequestParam("id") int regNo, @RequestParam("age") int newAge)
    {
        return studentService.updateAge(regNo, newAge);
    }

    @PutMapping("/update-course")
    public Student updateCourse(@RequestParam("id") int regNo, @RequestParam("course") String newCourse)
    {
        return  studentService.updateCourse(regNo, newCourse);
    }

    @PutMapping("update-courseBypath/{id}/{cour}")
    public Student updateCourseBypath(@PathVariable("id") int regNo, @PathVariable("cour") String newCourse)
    {
        return studentService.updateCourseBypath(regNo, newCourse);
    }

    @PutMapping("/change-course/{course}")
    public Student changeCourse(@RequestParam("id") int regNo, @PathVariable("course") String newCourse)
    {
        return studentService.changeCourse(regNo, newCourse);
    }

    @PutMapping("/change-course-age")
    public Student changeCourseAge(@RequestParam("id") int regNo, @RequestBody Student student)
    {
        return studentService.changeCourseAge(regNo, student);
    }

    @DeleteMapping("/deletebyParam")
    public String deleteStudentbyparam(@RequestParam("id") int regNo)
    {
        return studentService.deleteStudentbyparam(regNo);
    }

    @DeleteMapping("/deletebypath/{id}")
    public String deletebypath(@PathVariable("id") int regNo)
    {
        return  studentService.deletebypath(regNo);
    }

}
