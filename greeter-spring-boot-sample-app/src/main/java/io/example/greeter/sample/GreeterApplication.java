package io.example.greeter.sample;

import io.example.greeter.library.Greeter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GreeterApplication implements CommandLineRunner {

    @Autowired
    private Greeter greeter;

    public static void main(String[] args) {
        SpringApplication.run(GreeterApplication.class, args);
    }

    public void run(String... args) throws Exception {
        String message = greeter.greet();
        System.out.println(message);
    }
}
