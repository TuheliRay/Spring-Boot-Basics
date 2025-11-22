package com.SpringBoot.CRUD.controllers;

import com.SpringBoot.CRUD.entities.Student;
import com.SpringBoot.CRUD.services.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RequestMapping("/student")
@RestController
public class StudentController {
    private final StudentService studentService;
    @PostMapping("/add")
    public Student addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Integer id) {
        return studentService.findStudentById(id);
    }
    public Student findAllStudentsById(@PathVariable Integer id) {
        return studentService.findStudentById(id);
    }
    @PutMapping("/update/{id}")
    public Student updateStudentById(@RequestBody Student student , @PathVariable Integer id) {
        return studentService.updateStudent(student , id);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteStudentById(@PathVariable Integer id) {
        studentService.deleteStudentById(id);
    }
}
