package com.example.scope_bean.event;

import com.example.scope_bean.model.Employee;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;


@Component
public class EmployeeEventListener {

    @Async
    @EventListener({EmployeeEvent.class})
    public  void handleCreateEmployee(EmployeeEvent event){
        try {
            if(event.getData() instanceof Employee){
                Thread.sleep(5000L);
                System.out.println("waiting for 5 seconds ");
                Employee employee = (Employee)event.getData();
                System.out.println(employee.toString());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
