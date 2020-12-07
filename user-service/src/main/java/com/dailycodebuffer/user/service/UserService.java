package com.dailycodebuffer.user.service;

import com.dailycodebuffer.user.dto.UserDTO;

import com.dailycodebuffer.user.vo.ResponseTemplateVO;

import java.util.List;

public interface UserService
{
    List<UserDTO> showUsers();

    UserDTO saveUser(UserDTO userDTO, String departmentId);

    ResponseTemplateVO getUserWithDepartment(String userId);
}
