package com.chaitu.docker.dockerspringboot.resource;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chythu")
public class HelloResource1 {

    @GetMapping
    public  String hello(){
        return "hello world!";
    }
}


