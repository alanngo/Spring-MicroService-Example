package com.dailycodebuffer.department.dto;

import com.dailycodebuffer.department.entity.Department;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentDTO
{
    private String id;
    private String name;
    private String address;
    private String code;

    public static Department toEntity(DepartmentDTO dto)
    {
        Department ret = new Department();
        ret.setName(dto.getName());
        ret.setAddress(dto.getAddress());
        ret.setCode(dto.getCode());
        return ret;
    }

    public static DepartmentDTO toDTO(Department entity)
    {
        return new DepartmentDTO
        (
            entity.getId(),
            entity.getName(),
            entity.getAddress(),
            entity.getCode()
        );
    }
}
