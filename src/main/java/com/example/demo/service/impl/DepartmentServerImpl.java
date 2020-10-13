package com.example.demo.service.impl;

import com.example.demo.entity.Department;
import com.example.demo.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.beetl.sql.core.SQLManager;
import org.beetl.sql.core.SqlId;
import org.beetl.sql.core.page.DefaultPageRequest;
import org.beetl.sql.core.page.PageResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

/**
 * Author: 陈艺博
 * Date:  2020-10-09 15:14
 * Description:
 */

@Slf4j
@Service
public class DepartmentServerImpl implements DepartmentService {
    @Override
    public Department get(Integer id) {
        return this.sqlManager.single(Department.class, id);
    }

    @Override
    public Department add(Department department) {
        sqlManager.insert(department);
        return get(department.getId());
    }

    @Override
    public Department update(Department department) {
        sqlManager.updateById(department);
        return department;
    }

    @Override
    public void delete(Integer id) {
        sqlManager.deleteById(Department.class, id);
    }

    @Override
    public List<Department> getAll() {
        return sqlManager.lambdaQuery(Department.class)
                .asc(Department::getId)
                .select();
    }

    @Override
    public PageResult<Department> findAll(Integer pageLimit, Integer pageNumber) {
        return sqlManager.lambdaQuery(Department.class)
                .desc(Department::getId)
                .page(pageNumber, pageLimit);
    }

    @Override
    public List<Department> getOfTemp(Integer id) {
        var paras = new HashMap<>();
        paras.put("id",id);
        return sqlManager.select(SqlId.of("depart","departToUser"), Department.class, paras);
    }

    @Override
    public PageResult<Department> findOfTemp(Integer id, String name, Integer pageSize, Integer pageNumber) {

        var paras = new HashMap<>();
        paras.put("id",id);
        if (null != name){
            paras.put("name",'%'+name+'%');
        }
        return sqlManager.pageQuery(SqlId.of("depart","findDepartToUser"),
                Department.class, paras, DefaultPageRequest.of(pageNumber,pageSize));
    }

    @Resource
    private SQLManager sqlManager;
}
