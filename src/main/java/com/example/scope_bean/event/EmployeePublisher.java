package com.example.scope_bean.event;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class EmployeePublisher {

    private final ApplicationEventPublisher applicationEventPublisher;
    
    public EmployeePublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public  void publishEmployeeEvent(final EmployeeEvent event){
      applicationEventPublisher.publishEvent(event);
    }
}
