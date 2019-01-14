package com.hand.spring.factory;

import com.hand.spring.service.Impl.CustomerServiceImpl;

public class InstanceFactory {

    public CustomerServiceImpl getCustomerService(){
        return new CustomerServiceImpl();
    }
}
