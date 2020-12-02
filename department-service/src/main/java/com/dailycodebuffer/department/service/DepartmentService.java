package com.dailycodebuffer.department.service;

import com.dailycodebuffer.department.dto.DepartmentDTO;

import java.util.Collection;

public interface DepartmentService
{
    DepartmentDTO saveDepartment(DepartmentDTO departmentDTO);

    DepartmentDTO findDepartmentById(String id);

    Collection<DepartmentDTO> findAllDepartments();
}
