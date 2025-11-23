package com.SpringBoot.CRUD.controllers;

import com.SpringBoot.CRUD.Constants.APIpaths;
import com.SpringBoot.CRUD.entities.Student;
import com.SpringBoot.CRUD.services.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
@AllArgsConstructor
@RequestMapping(APIpaths.STUDENT)
@RestController
public class StudentController {
    private final StudentService studentService;
    @PostMapping(APIpaths.ADD)
    public Student addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }
    @GetMapping(APIpaths.GET)
    public Student getStudentById(@PathVariable Integer id) {
        return studentService.findStudentById(id);
    }
    public Student findAllStudentsById(@PathVariable Integer id) {
        return studentService.findStudentById(id);
    }
    @PutMapping(APIpaths.UPDATE)
    public Student updateStudentById(@RequestBody Student student , @PathVariable Integer id) {
        return studentService.updateStudent(student , id);
    }
    @DeleteMapping(APIpaths.DELETE)
    public void deleteStudentById(@PathVariable Integer id) {
        studentService.deleteStudentById(id);
    }
}
