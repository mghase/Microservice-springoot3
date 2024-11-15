package tz.go.qksoftz.todoserviceclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProducerController {
    @GetMapping("/message")
    public String message(){
        return "Hello World from todo service!";
    }
}
