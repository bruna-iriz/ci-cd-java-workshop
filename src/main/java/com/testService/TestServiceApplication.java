package com.testService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/***
 * This is the javadoc example.
 */
@SpringBootApplication
@ComponentScan(basePackageClasses = {TestController.class})
@EnableAutoConfiguration
public class TestServiceApplication {

    public static void main(final String[] args) {
        SpringApplication.run(TestServiceApplication.class, args);
        System.exit(0);
    }

}
