package cn.magichell.controllers;


import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Profile("dev")
@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/qw")
    public String sayHi(){
        return "hello springboot";
    }

    public HelloController(){
        System.out.println("懒加载");
    }

}
