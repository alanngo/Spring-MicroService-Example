package com.dailycodebuffer.user.service;

import com.dailycodebuffer.user.dto.UserDTO;
import com.dailycodebuffer.user.vo.ResponseTemplateVO;

public interface UserService
{
    UserDTO saveUser(UserDTO userDTO, String departmentId);

    ResponseTemplateVO getUserWithDepartment(String userId);
}
