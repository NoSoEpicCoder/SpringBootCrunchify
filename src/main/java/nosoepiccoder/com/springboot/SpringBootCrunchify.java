package main.java.nosoepiccoder.com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class SpringBootCrunchify {

    @RequestMapping("/")
    String basicURL() {
        return "Welcome to NoSoEpicCoder's site";
    }

    @RequestMapping("/hello")
    String helloURL() {
        return "Hello there!";
    }

    @GetMapping("/name")
    String getName(@RequestParam(value = "name", defaultValue = "bob") String name) {
        return String.format("Hello there %s, welcome to my site", name);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringBootCrunchify.class, args);
    }
}
