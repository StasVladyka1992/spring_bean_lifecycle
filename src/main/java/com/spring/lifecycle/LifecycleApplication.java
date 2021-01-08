package com.spring.lifecycle;

import com.spring.lifecycle.model.AwareBeanInterface;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LifecycleApplication {


    public static void main(String[] args) {
        SpringApplication.run(LifecycleApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            //AwareBean example
            AwareBeanInterface awareBean = ctx.getBean(AwareBeanInterface.class);


            SpringApplication.exit(ctx, () -> 0);
        };
    }
}
