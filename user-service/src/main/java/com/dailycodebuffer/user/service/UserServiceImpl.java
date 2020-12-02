package com.dailycodebuffer.user.service;

import com.dailycodebuffer.user.dto.UserDTO;
import static com.dailycodebuffer.user.dto.UserDTO.*;
import com.dailycodebuffer.user.entity.User;
import com.dailycodebuffer.user.repository.UserRepository;

import com.dailycodebuffer.user.vo.Department;
import com.dailycodebuffer.user.vo.ResponseTemplateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService
{
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public UserDTO saveUser(UserDTO userDTO, String userId)
    {
        Department department= restTemplate.getForObject("http://localhost:9000/departments/"+userId, Department.class);
        userDTO.setDepartment(department);
        User entity=userRepository.save(toEntity(userDTO));
        return toDTO(entity);
    }

    @Override
    public ResponseTemplateVO getUserWithDepartment(String userId) {
        return null;
    }


}
