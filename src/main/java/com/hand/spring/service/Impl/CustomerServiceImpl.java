package com.hand.spring.service.Impl;

import com.hand.spring.dao.ICustomerDao;
import com.hand.spring.service.ICustomerService;

public class CustomerServiceImpl implements ICustomerService {

    private ICustomerDao iCustomerDao;

    public void setiCustomerDao(ICustomerDao iCustomerDao) {
        this.iCustomerDao = iCustomerDao;
    }

    @Override
    public void saveCustomer() {
        System.out.println("调用Dao方法");
        iCustomerDao.saveCustomer();
    }
}
