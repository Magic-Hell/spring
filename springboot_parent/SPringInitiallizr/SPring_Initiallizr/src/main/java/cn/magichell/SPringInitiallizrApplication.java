package cn.magichell;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SPringInitiallizrApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(SPringInitiallizrApplication.class);
        //app.setBannerMode(Banner.Mode.OFF);//可以关闭spring boot启动横幅（就是那个超大号springboot）
        app.run(args);
    }

}
