package com.dailycodebuffer.department.repository;

import com.dailycodebuffer.department.entity.Department;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DepartmentRepository extends MongoRepository<Department, String>
{
}
