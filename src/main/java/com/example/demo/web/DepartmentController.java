package com.example.demo.web;

import com.example.demo.entity.Department;
import com.example.demo.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.beetl.sql.core.page.PageResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Author: 陈艺博
 * Date:  2020-10-09 15:18
 * Description:
 */
@Slf4j
@RestController
public class DepartmentController {
    @GetMapping("/dep/{id}")
    public Department get(@PathVariable("id") Integer id) {
        return depService.get(id);
    }

    @PostMapping("/dep")
    public Department add(@RequestBody Department department) {
        return depService.add(department);
    }

    @PutMapping("/dep")
    public Department update(@RequestBody Department department) {
        return depService.update(department);
    }

    @DeleteMapping("/dep/{id}")
    public void delete(@PathVariable("id") Integer id) {
        depService.delete(id);
    }

    @GetMapping("/dep/all")
    public List<Department> getAll() {
        return depService.getAll();
    }

    @GetMapping("/dep/find")
    public PageResult<Department> find(@RequestParam("size") Integer pageSize,
                                       @RequestParam("number") Integer pageNumber) {
        return depService.findAll(pageSize, pageNumber);
    }

    @GetMapping("/dep/tmp")
    public List<Department> getTmp(@RequestParam(value = "id", required = false) Integer id) {
        return depService.getOfTemp(id);
    }

    @GetMapping("/dep/find/tmp")
    public PageResult<Department> findTmp(@RequestParam(value = "id", required = false) Integer id,
                                          @RequestParam(value = "name", required = false) String name,
                                          @RequestParam("size") Integer pageSize, @RequestParam("number") Integer pageNumber) {
        return depService.findOfTemp(id, name, pageSize, pageNumber);
    }

    @Resource
    private DepartmentService depService;
}
