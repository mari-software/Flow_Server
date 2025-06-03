package software.mari.flow_server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(path = "/hello")
    public String helloWorld()  {
        return "hello world";
    }

    @GetMapping(path = "/about")
    public String about()  {
        return "This is about learning how to use spring-boot";
    }

}
