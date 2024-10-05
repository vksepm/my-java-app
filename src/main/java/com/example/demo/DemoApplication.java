package com.example.demo;

// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.beans.factory.annotation.Value;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RestController;

// @SpringBootApplication
// public class DemoApplication {

//   @Value("${NAME:World}")
//   String name;

//   @RestController
//   class HelloworldController {
//     @GetMapping("/")
//     String hello() {
//       return "Hello " + name + "!";
//     }
//   }

//   public static void main(String[] args) {
//     SpringApplication.run(DemoApplication.class, args);
//   }

// }
// Suggested code may be subject to a license. Learn more: ~LicenseLog:1615664694.

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
