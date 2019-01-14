package com.hand.spring.hello;

import com.hand.spring.service.Impl.HelloWorldService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Peter
 * @ClassName: HelloProgram
 * @Description: TODO
 * @date 2019/1/10 17:24
 * @Version 1.0
 */
public class HelloProgram {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        HelloWorldService helloWorldService = (HelloWorldService) applicationContext.getBean("helloWorldService");
        HelloWorld helloWorld = helloWorldService.getHelloWorld();
        helloWorld.sayHello();
    }
}
