package com.hand.spring;

import com.hand.spring.dao.ICustomerDao;
import com.hand.spring.service.ICustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");

        ICustomerService iCustomerService = (ICustomerService) applicationContext.getBean("customerService");

        ICustomerDao iCustomerDao = (ICustomerDao) applicationContext.getBean("customerDao");

        ICustomerService staticCustomer = (ICustomerService) applicationContext.getBean("staticCustomer");
        ICustomerService instanceCustomer = (ICustomerService) applicationContext.getBean("instanceCustomer");

        iCustomerService.saveCustomer();
        staticCustomer.saveCustomer();
        instanceCustomer.saveCustomer();

        //System.out.println("staticCustomer:" + staticCustomer);
        System.out.println("instanceCustomer:" + instanceCustomer);
        System.out.println(iCustomerService);
        System.out.println(iCustomerDao);
    }
}
