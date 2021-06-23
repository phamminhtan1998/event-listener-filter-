package com.example.scope_bean.service;

import com.example.scope_bean.model.Employee;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    List<Employee> employees = new ArrayList<>();
    public Employee add(String empId, String firstName, String secondName) {
        Employee employee = new Employee();
        employee.setIdEmp(empId);
        employee.setFirstName(firstName);
        employee.setSecondName(secondName);
        employees.add(employee);
        secondName= "should be change name";
        return employee;
    }

    public Employee delete(String empId) {
        Optional<Employee> first = employees.stream().filter(employee -> employee.getIdEmp().equals(empId))
                .findFirst();
        return first.get();
    }
}
