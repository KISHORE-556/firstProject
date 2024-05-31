package dev.kishore.firstproject.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class firstProject {

    @GetMapping("/hello")
    public String sayHello()
    {
        return "Hello World!!";
    }

    @GetMapping("/hi")
    public String sayHi(){
        return "HI!!!";
    }


}
