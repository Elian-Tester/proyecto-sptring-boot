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
        return "byee xe 14 de julio del 2022... spring boot </3  ";
    }

    @GetMapping("neta")
    public String neta(){
        return "neta, jaló?  14 de julio del 2022 ... ";
    }
}