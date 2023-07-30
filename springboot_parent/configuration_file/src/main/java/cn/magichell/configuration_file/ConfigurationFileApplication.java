package cn.magichell.configuration_file;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@SpringBootApplication
public class ConfigurationFileApplication {
    public static void main(String[] args) throws IOException {
        SpringApplication springApplication = new SpringApplication(ConfigurationFileApplication.class);
        //app.setBannerMode(Banner.Mode.OFF);//可以关闭spring boot启动横幅（就是那个超大号springboot）

        //创建Properties
        Properties properties  = new Properties();

        //通过当前类的ClassLoader
        InputStream is = ConfigurationFileApplication.class.getClassLoader().
                getResourceAsStream("app.properties");
        //将输入流读取成propertie
        properties.load(is);
        System.out.print(properties);
        springApplication.setDefaultProperties(properties);
        springApplication.run(args);
    }
}
