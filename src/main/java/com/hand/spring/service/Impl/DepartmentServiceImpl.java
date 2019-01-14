package com.hand.spring.service.Impl;

import com.hand.spring.bean.DepartmentDO;
import com.hand.spring.dao.DepartmentDao;
import com.hand.spring.service.DepartmentService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Peter
 * @ClassName: DepartmentServiceImpl
 * @Description: TODO
 * @date 2019/1/13 15:48
 * @Version 1.0
 */

@Service(value = "departmentService")
public class DepartmentServiceImpl implements DepartmentService {

    @Resource
    private DepartmentDao departmentDao;
    private DepartmentDO departmentDO;

    /**
     * @Name
     * @Author Peter
     * @Description TODO
     * @Date 2019/1/14 14:25
     * @Param
     */
    @Override
    public List<DepartmentDO> getDepartment() {
        departmentDao.getDepartment();
        return null;
    }

    @Override
    public void updateDepartment() {
        departmentDao.updateDepartment();
    }

    @Override
    public void insertDepartment() {
        departmentDao.insertDepartment(departmentDO);
    }

    @Override
    public void deleteDepartment() {
        System.out.println("空指针异常");
        departmentDao.deleteDepartmentById(111L);
    }

    @Override
    public DepartmentDO queryDepartmentById(Long deptId) {
        departmentDao.queryDepartmentById(111L);
        return null;
    }
}
