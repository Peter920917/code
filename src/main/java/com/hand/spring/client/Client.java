package com.hand.spring.client;

import com.hand.spring.bean.CustomerDO;
import com.hand.spring.bean.DepartmentDO;
import com.hand.spring.bean.SetupCustomerDO;
import com.hand.spring.dao.DepartmentDao;
import com.hand.spring.service.DepartmentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @author Peter
 * @ClassName: DepartmentDaoImpl
 * @Description: TODO
 * @date 2019/1/11 16:18
 * @Version 1.0
 */
public class Client {


    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-module.xml");
        DepartmentService departmentService1 = (DepartmentService) applicationContext.getBean("departmentService");
        System.out.println("departmentService1:" + departmentService1);

        DepartmentService departmentService2 = (DepartmentService) applicationContext.getBean("departmentService");
        System.out.println("departmentService2:" + departmentService2);

        DepartmentService departmentService = (DepartmentService) applicationContext.getBean("departmentService");
        System.out.println("departmentService:" + departmentService);
        departmentService.deleteDepartment();
        departmentService.getDepartment();
        departmentService.insertDepartment();
        departmentService.queryDepartmentById(111L);
        departmentService.updateDepartment();


        ApplicationContext beanApplicationContext = new ClassPathXmlApplicationContext("bean.xml");
        SetupCustomerDO setupCustomerDO = (SetupCustomerDO) beanApplicationContext.getBean("baseCustomerMalaysia");
        System.out.println(setupCustomerDO);
        SetupCustomerDO customerBean = (SetupCustomerDO) beanApplicationContext.getBean("customerBean");
        System.out.println(customerBean);



/*        for (DepartmentDO departmentDO : customerDO.getList()) {
            System.out.println(departmentDO.getDeptId());
            System.out.println(departmentDO.getDeptName());
            System.out.println(departmentDO.getDeptNo());
        }*/

        /*
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
        System.out.println(iCustomerDao);*/

        /*DepartmentDao departmentDAO = (DepartmentDao) applicationContext.getBean("departmentDAO");
        System.out.println(departmentDAO);
        List<DepartmentDO> departmentDOS = departmentDAO.queryDepartment();
        *//*List<DepartmentDO> departmentDOS = departmentDAO.queryDepartment();*//*

        for (DepartmentDO departmentDO : departmentDOS) {
            System.out.println("Dept Id" + departmentDO.getDeptId());
            System.out.println("Dept No" + departmentDO.getDeptNo());
            System.out.println("Dept Name" + departmentDO.getDeptName());
        }
*/
    }
}
