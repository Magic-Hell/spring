package cn.magichell;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //标记成SpringBoot的启动类
public class Application {
    public static void main (String[] args){
        SpringApplication.run(Application.class,args);
    }
}
