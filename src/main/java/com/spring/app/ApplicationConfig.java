package com.spring.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.Arrays;
import java.util.List;

@Configuration
public class ApplicationConfig {

    @Bean
    public Staff staff() {
        return new Staff(1, "Ragul", "CSE", 9445543300L);
    }

    @Bean
    public Department department() {
        List<Staff> staffList = Arrays.asList(staff());
        return new Department(123, staffList);
    }
}