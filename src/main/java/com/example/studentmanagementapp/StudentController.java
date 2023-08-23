package com.example.studentmanagementapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity getStudentUsingPath(@PathVariable("id") int regNo)
    {
        Student student = studentService.getStudentUsingPath(regNo);
        if(student == null)
        {
            return new ResponseEntity("doesnt exist", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity(student, HttpStatus.FOUND);
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
