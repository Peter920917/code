package com.hand.spring.dao;

import com.hand.spring.bean.DepartmentDO;

import java.util.List;

/**
 * @author Peter
 * @ClassName: DepartmentDao
 * @Description: TODO
 * @date 2019/1/11 16:16
 * @Version 1.0
 */
public interface DepartmentDao {
    public List<DepartmentDO> getDepartment();

    public void updateDepartment();

    public void insertDepartment(DepartmentDO departmentDO);

    public void deleteDepartmentById(Long deptId);

    public DepartmentDO queryDepartmentById(Long deptId);
}
