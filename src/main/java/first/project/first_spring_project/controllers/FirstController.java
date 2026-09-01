package first.project.first_spring_project.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping("/")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String sayHello() {
        return "Hello from first controller";
    }

    @PostMapping("/post")
    public String post(@RequestBody String body) {
        return "Posted successfully and the body is: " + body;
    }

    @PostMapping("/post-order")
    public String postOrder(@RequestBody Order order) {
        return "Posted successfully and the order is: " + order;
    }

    @GetMapping("/product/{productName}")
    public String pathVar(@PathVariable("productName") String name) {
        return "Your product name is: " + name;
    }

    @GetMapping("/hello")
    public String requestParams(
            @RequestParam("name") String name,
            @RequestParam("age") String age) {
        return "Hello " + name + " you are " + age + " years old";
    }

}
