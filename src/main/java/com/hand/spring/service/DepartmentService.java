package com.hand.spring.service;

import com.hand.spring.bean.DepartmentDO;

import java.util.List;

/**
 * @author Peter
 * @ClassName: DepartmentService
 * @Description: TODO
 * @date 2019/1/13 16:18
 * @Version 1.0
 */
public interface DepartmentService {
    public List<DepartmentDO> getDepartment();

    public void updateDepartment();

    public void insertDepartment();

    public void deleteDepartment();

    public DepartmentDO queryDepartmentById(Long deptId);
}
