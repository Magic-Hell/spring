package cn.magichell.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  //相当与@Controller+@Response
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping("/world")
    public String sayHi(){
        return "helloworld";
    }
}
