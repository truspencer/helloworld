package com.example.helloworldspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringBootAppLauncher extends SpringBootServletInitializer {
public static void main(String[] args) {
SpringApplication.run(HelloWorldController.class, args);
}
}


