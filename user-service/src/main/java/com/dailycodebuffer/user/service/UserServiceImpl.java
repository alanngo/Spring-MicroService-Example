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

import java.util.ArrayList;
import java.util.List;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService
{
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public List<UserDTO> showUsers()
    {
        List<UserDTO> ret = new ArrayList<>();
        userRepository.findAll().forEach(user -> ret.add(toDTO(user)));
        return ret;
    }

    @Override
    public UserDTO saveUser(UserDTO userDTO, String departmentId)
    {
        Department department= restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/"+departmentId, Department.class);
        userDTO.setDepartment(department);
        User entity=userRepository.save(toEntity(userDTO));
        return toDTO(entity);
    }

    @Override
    public ResponseTemplateVO getUserWithDepartment(String userId) {
        return null;
    }


}
