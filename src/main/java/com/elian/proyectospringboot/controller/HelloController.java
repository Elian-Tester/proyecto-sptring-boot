package com.elian.proyectospringboot.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloController {
    @GetMapping("hello")
    public String hello(){
        return "Hola spring boot <3 ";
    }

    @GetMapping("bye")
    public String bye(){
        return "bye x2 spring boot </3  14/07/22";
    }
}