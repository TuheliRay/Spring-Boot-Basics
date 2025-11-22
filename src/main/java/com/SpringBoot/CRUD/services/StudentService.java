package com.SpringBoot.CRUD.services;

import com.SpringBoot.CRUD.entities.Student;
import com.SpringBoot.CRUD.repositories.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentService {
    private StudentRepository studentRepository;
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }
    public Student findStudentById(Integer id) {
        return studentRepository.findById(id).orElse(null);
    }
    public Iterable<Student> findAllStudents() {
        return studentRepository.findAll();
    }
    public Student updateStudent(Student student , Integer id) {
        Student existingStudent = studentRepository.findById(id).orElse(null);
        if (existingStudent == null) {
            return null;
        }
         existingStudent.setEmail(student.getEmail());
         return studentRepository.save(existingStudent);
    }
    public void deleteStudentById(Integer id) {
         studentRepository.deleteById(id);
    }
}
