package com.htein.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringAppApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(StudentRepository repository) {
        return (args) -> {
            // Data အသစ်တစ်ခု တည်ဆောက်ခြင်း
            Student s1 = new Student();
            s1.setName("Mg Mg");
            s1.setEmail("mgmg@gmail.com");

            // Database ထဲသို့ သိမ်းဆည်းခြင်း
            repository.save(s1);

            System.out.println("-------------------------------");
            System.out.println("Student saved successfully!");
            System.out.println("-------------------------------");
        };
    }
}

