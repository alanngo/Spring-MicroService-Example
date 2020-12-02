package com.dailycodebuffer.user.dto;

import com.dailycodebuffer.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO
{
    private String id;
    private String name;
    private String email;
    private Object department;

    public static User toEntity(UserDTO dto)
    {
        User ret = new User();
        ret.setName(dto.getName());
        ret.setEmail(dto.getEmail());
        ret.setDepartment(dto.getDepartment());
        return ret;
    }

    public static UserDTO toDTO(User entity)
    {
        return new UserDTO
        (
            entity.getId(),
            entity.getName(),
            entity.getEmail(),
            entity.getDepartment()
        );
    }
}
