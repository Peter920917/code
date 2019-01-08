package com.hand.spring.factory;

import com.hand.spring.service.Impl.CustomerServiceImpl;

public class StaticFactory {


    public static CustomerServiceImpl getCustomerService(){
        return new CustomerServiceImpl();
    }
}
