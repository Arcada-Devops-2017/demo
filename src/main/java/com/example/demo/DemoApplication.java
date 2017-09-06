package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

    private final TextGetter textGetter;

    @Autowired
    public DemoApplication(TextGetter textGetter) {
        this.textGetter = textGetter;
    }


    private TextObject getRetval(){
        return new TextObject(textGetter.getValue());
    }

	@RequestMapping(value = "/", produces = "application/json; charset=UTF-8")
	public TextObject helloWorld(){
		return getRetval();
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
