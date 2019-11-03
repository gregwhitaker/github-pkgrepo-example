package hello.service.controller;

import hello.core.Hello;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public ResponseEntity<?> sayHello(@RequestParam(value = "name", required = false) String name) {
        return ResponseEntity.ok(Hello.sayHello(name));
    }
}
