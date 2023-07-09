# spring
# 基于Java的配置
从Spring3.0开始，由Spring JavaConfig项目提供的功能已经成为Spring核心框架的一部分。因此，可以使用Java配置来代替XML配置定义外部bean

JavaConfig原来是Spring的一个子项目。它通过Java类的方式提供bean的定义信息

## 基于Java的容器配置
@Configuration  用于标记一个spring配置类（之前是根据xml启动spring上下文）{相当于一个xml文件}
@ComponentScan  用于扫包的相当于component-scan{@ComponentScan(basePackages = "cn.magichell")}

# SpringBoot
Spring底层在解析配置类，回去解析@ComponentScan，读取basePackages，如果没有读取到，会将当前配置类所在的包当作扫描包
位置：最好放在需要扫描报的根目录下（像HelloController.java）

在resources文件夹目录结构中
- static保存所有的静态资源：js.css.images
- templates: 保存所有的模板页：（Springboot默认jar包使用嵌入式Tomcat，默认不支持JSP页面，可以使用模板引擎（freemarker、thymeleaf））
- application.properties:Spring boot应用配置文件，可以修改一些默认配置