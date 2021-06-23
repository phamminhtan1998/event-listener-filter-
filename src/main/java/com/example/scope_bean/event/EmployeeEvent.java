package com.example.scope_bean.event;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;

@Getter
@Setter
public class EmployeeEvent<T> extends ApplicationEvent {
    private T data;
    public  EmployeeEvent(Object source, T data) {
        super(source);
        this.data = data;
    }

}
