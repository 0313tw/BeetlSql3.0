package com.example.demo.service;

import com.example.demo.entity.Department;
import org.beetl.sql.core.page.PageResult;

import java.util.List;

/**
 * Author: 陈艺博
 * Date:  2020-10-09 15:13
 * Description:
 */
public interface DepartmentService {

    /**
     * 获取部门
     * @param id 部门id
     */
    Department get(Integer id);

    /**
     * 添加部门
     */
    Department add(Department department);

    /**
     * 更新部门
     */
    Department update(Department department);

    /**
     * 删除部门
     * @param id 部门id
     */
    void delete(Integer id);

    /**
     * 获取部门列表
     */
    List<Department> getAll();

    /**
     * 分页获取部门
     * @param pageLimit  条数
     * @param pageNumber 页数
     */
    PageResult<Department> findAll(Integer pageLimit, Integer pageNumber);

    /**
     * 通过模板方式 查询部门 并关联user
     * @param id 部门id
     */
    List<Department> getOfTemp(Integer id);

    /**
     * 通过模板方式 分页查询部门信息, 并关联user
     * @param pageSize   条数
     * @param pageNumber 页数
     */
    PageResult<Department> findOfTemp(Integer id, String name,Integer pageSize, Integer pageNumber);
}
