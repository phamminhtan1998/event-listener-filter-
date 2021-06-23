package com.example.scope_bean.controller;

import com.example.scope_bean.event.EmployeeEvent;
import com.example.scope_bean.event.EmployeePublisher;
import com.example.scope_bean.model.Employee;
import com.example.scope_bean.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private EmployeePublisher employeePublisher;

    @GetMapping("/add/employee")
    public Employee addEmployee(
            @RequestParam("empId")String empId,
            @RequestParam("firstName")String firstName,
            @RequestParam("secondName")String secondName){
        return employeeService.add(empId,firstName,secondName);
    }

    @GetMapping("/delete/employee")
    public Employee addEmployee(@RequestParam("empId")String empId){
        return employeeService.delete(empId);
    }

    @GetMapping("/test/body")
    public String testBody(@RequestBody Employee employee){
        System.out.println(employee.toString());
        employeePublisher.publishEmployeeEvent(new EmployeeEvent<>(this,"hello"));
        return " Test body ";
    }
}
