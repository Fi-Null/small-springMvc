package com.small.springMvc.webappProject.service;

import com.small.spring.beans.annotation.Service;
import com.small.spring.beans.annotation.Value;

@Service
public class PersonService {
    @Value("第一次注入")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PersonService{" +
                "name='" + name + '\'' +
                '}';
    }
}
