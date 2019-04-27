package org.jai.spring.firstspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class FirstSpringBootApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(FirstSpringBootApplication.class, args);
        System.out.printf("Lets inspect some beans provided by Spring Boot:\n");
        String[] beans = context.getBeanDefinitionNames();
        Arrays.sort(beans);
        Arrays.stream(beans).forEach(bean -> System.out.println(bean));
    }

}
