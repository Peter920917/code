package com.hand.spring.bean;

import org.springframework.stereotype.Component;

/**
 * @author Peter
 * @ClassName: DepartmentDO
 * @Description: TODO
 * @date 2019/1/11 16:14
 * @Version 1.0
 */


public class DepartmentDO {
    private Long deptId;
    private String deptNo;
    private String deptName;

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public String getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(String deptNo) {
        this.deptNo = deptNo;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
