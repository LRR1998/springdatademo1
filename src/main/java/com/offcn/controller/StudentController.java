package com.offcn.controller;

import com.offcn.dao.StudentDao;
import com.offcn.entity.Student;
import com.offcn.mapper.StudentMapper;
import com.offcn.pojo.Stu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentDao studentDao;
    @Autowired
    StudentMapper studentMapper;
    @RequestMapping("/getStudents")
    @ResponseBody
    public List<Student> getStudents(){
        return studentDao.findAll();
    }
    @RequestMapping("/getStudentList")
    public String getStudentList(Model model){
        model.addAttribute("students",studentDao.findAll());
        return "user";
    }
    @RequestMapping("/getStu")
    @ResponseBody
    public List<Stu> getStus(){
        return studentMapper.getStudents();
    }
}
