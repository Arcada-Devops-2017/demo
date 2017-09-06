package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanProvider {

    @Value("${demo.mock}")
    boolean mock;

    @Bean
    public TextGetter textGetter(){
        return mock ? new TextGetterMockImpl() : new TextGetterImpl();
    }
}
