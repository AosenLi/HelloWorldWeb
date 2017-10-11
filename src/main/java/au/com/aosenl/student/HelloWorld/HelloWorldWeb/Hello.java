package au.com.aosenl.student.HelloWorld.HelloWorldWeb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @GetMapping("/")
    public String sayHi() {
        return "hello World Its successful";
    }
}
