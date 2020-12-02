package com.dailycodebuffer.department.api;

import com.dailycodebuffer.department.dto.DepartmentDTO;
import com.dailycodebuffer.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import static org.springframework.http.HttpStatus.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/departments")
@Slf4j
public class DepartmentAPI
{
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("")
    public ResponseEntity<DepartmentDTO> saveDepartment(@RequestBody DepartmentDTO departmentDTO)
    {
        log.info("Inside saveDepartment of API");
        return new ResponseEntity<>(departmentService.saveDepartment(departmentDTO), CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DepartmentDTO> getDepartmentById(@PathVariable String id)
    {
        log.info("Inside getDepartmentById of API");
        return new ResponseEntity<>(departmentService.findDepartmentById(id), OK);
    }
}
