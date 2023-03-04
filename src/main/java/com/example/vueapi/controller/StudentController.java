package com.example.vueapi.controller;

import com.example.vueapi.JsonResult;
import com.example.vueapi.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:
 * @date: 2023/3/4 10:49 上午
 * @description
 */
@RestController
public class StudentController {

    @GetMapping("/api/students")
    public JsonResult<List<Student>> studentList(){
        List<Student> students = new ArrayList();
        Student student = new Student();
        student.setId(1);
        student.setName("卡尔");
        student.setAge(18);
        student.setGender("男");
        students.add(student);

        Student student1 = new Student();
        student1.setId(2);
        student1.setName("德鲁伊");
        student1.setAge(40);
        student1.setGender("男");
        students.add(student1);

        return JsonResult.success(students);
    }
}