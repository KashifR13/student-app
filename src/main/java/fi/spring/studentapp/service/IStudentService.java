package fi.spring.studentapp.service;

import fi.spring.studentapp.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IStudentService {
    Student saveStudent(Student student);
    List<Student> getAllStudents();
}