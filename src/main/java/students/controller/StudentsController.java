package students.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import students.StudentService;
import students.Students;

import java.util.List;


@Controller
@RequiredArgsConstructor
public class StudentsController{

    private final StudentService studentService;

    @GetMapping(value = "/")
    public String home(Model model){
        List<Students> s = studentService.findAll();
        model.addAttribute("students", s);
        return "index";
    }

    @GetMapping(value = "/addstudent")
    public String addstudentForm(Model model){
        model.addAttribute("student", new Students());
        return "addstudent";
    }

    @GetMapping(value = "/changestudent/{id}")
    public String addstudentForm(@PathVariable Long id, Model model){
        model.addAttribute("student", studentService.findById(id).orElse(new Students()));
        return "editstudent";
    }

    @PostMapping("/addstudent")
    public String addstudentSave(Students student, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "addstudent";
        }
        studentService.addStudent(student);
        return "redirect:/";
    }

    @PostMapping("/changestudent")
    public String changestudentSave(Students student, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "addstudent";
        }
        studentService.addStudent(student);
        return "redirect:/";
    }

    @GetMapping("/delstudent/{id}")
    public String delStudent(@PathVariable Long id){
        studentService.delStudent(id);
        return "redirect:/";
    }

}


