package com.example.scope_bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String name;
    private String pass;
}
