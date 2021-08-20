package com.example.spring_try;

import com.example.spring_try.exceptions.PerformanceException;
import com.example.spring_try.models.Performer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class SpringTryApplication {

    public static void main(String[] args) throws PerformanceException {
        ApplicationContext context = new ClassPathXmlApplicationContext("components.xml");
        Performer performer = (Performer) context.getBean("eddie");
        performer.perform();

    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            System.out.println("Let's inspect the beans provided by Spring Boot:");

            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                System.out.println(beanName);
            }

        };
    }
}
