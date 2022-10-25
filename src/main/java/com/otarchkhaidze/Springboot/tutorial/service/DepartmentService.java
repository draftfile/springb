package com.otarchkhaidze.Springboot.tutorial.service;

import com.otarchkhaidze.Springboot.tutorial.entity.Department;
import com.otarchkhaidze.Springboot.tutorial.error.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {
    Department saveDepartment(Department department);

    List<Department> fetchDepartmentList();

    Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException;

    void deleteDepartmentByid(Long departmentId);

    Department updateDepartment(Long deparmentId, Department department);

    Department fetchDepartmentByName(String departmentName);
}
