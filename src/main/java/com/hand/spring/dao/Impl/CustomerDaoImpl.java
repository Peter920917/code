package com.hand.spring.dao.Impl;

import com.hand.spring.dao.ICustomerDao;

public class CustomerDaoImpl implements ICustomerDao {
    @Override
    public void saveCustomer() {
        System.out.println("保存客户");
    }
}
