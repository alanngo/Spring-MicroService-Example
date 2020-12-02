package com.dailycodebuffer.department.service;

import static com.dailycodebuffer.department.dto.DepartmentDTO.*;
import com.dailycodebuffer.department.entity.Department;
import com.dailycodebuffer.department.dto.DepartmentDTO;
import com.dailycodebuffer.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service("departmentService")
@Transactional
@Slf4j
public class DepartmentServiceImpl implements DepartmentService
{
    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public DepartmentDTO saveDepartment(DepartmentDTO departmentDTO)
    {
        log.info("inside save department of service");
        Department entity = departmentRepository.save(toEntity(departmentDTO));
        return toDTO(entity);
    }

    @Override
    public DepartmentDTO findDepartmentById(String id)
    {
        Department tmp = departmentRepository.findById(id)
                .orElseThrow(RuntimeException::new);

        return toDTO(tmp);
    }

    @Override
    public List<DepartmentDTO> findAllDepartments()
    {
        List<DepartmentDTO> ret = new ArrayList<>();
        departmentRepository.findAll().forEach(e -> ret.add(toDTO(e)));
        return ret;
    }
}
