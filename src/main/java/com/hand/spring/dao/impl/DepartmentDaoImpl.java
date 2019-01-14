package com.hand.spring.dao.impl;

import com.hand.spring.bean.DepartmentDO;
import com.hand.spring.dao.DepartmentDao;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Peter
 * @ClassName: DepartmentDaoImpl
 * @Description: TODO
 * @date 2019/1/11 16:18
 * @Version 1.0
 */

@Repository(value = "departmentDao")
public class DepartmentDaoImpl implements DepartmentDao {

    @Resource
    private DataSource dataSource;

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void updateDepartment() {
        System.out.println("更新了数据");
    }

    @Override
    public void insertDepartment(DepartmentDO departmentDO) {
        System.out.println("插入了数据");
    }

    @Override
    public void deleteDepartmentById(Long deptId) {
        System.out.println("删除了数据");
    }


    @Override
    public DepartmentDO queryDepartmentById(Long deptId) {
        System.out.println("查询出了数据");
        return null;
    }

    /**
     * @return
     * @Name
     * @Author Peter
     * @Description TODO
     * @Date 2019/1/11 16:22
     * @Param
     */
    @Override
    public List<DepartmentDO> getDepartment() {
        Connection connection = null;
        try {
            connection = dataSource.getConnection();
            String sql = "select d.dept_id,d.dept_no,d.dept_name from springtest.department d";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            List<DepartmentDO> departmentDOS = new ArrayList<DepartmentDO>();
            while (resultSet.next()) {
                DepartmentDO departmentDO = new DepartmentDO();
                departmentDO.setDeptId(resultSet.getLong("dept_id"));
                departmentDO.setDeptNo(resultSet.getString("dept_no"));
                departmentDO.setDeptName(resultSet.getString("dept_name"));
                departmentDOS.add(departmentDO);
            }

            return departmentDOS;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
