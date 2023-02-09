package fi.spring.studentapp.controller;

import fi.spring.studentapp.model.Student;
import fi.spring.studentapp.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@ResponseBody
@RequestMapping("/student")
@CrossOrigin
public class StudentController {

    private final IStudentService studentService;

    public StudentController(IStudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/save")
    public String saveStudentData (@RequestBody Student student) {

        studentService.saveStudent(student);
        return "The data for new student is saved successfully.";
    }

    @GetMapping("/view")
    public List<Student> getAllStudentsData() {

        return studentService.getAllStudents();
    }
}
