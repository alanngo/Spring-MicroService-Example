package com.dailycodebuffer.user.api;

import com.dailycodebuffer.user.dto.UserDTO;
import com.dailycodebuffer.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import static org.springframework.http.HttpStatus.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/users")
@Slf4j
public class UserAPI
{
    @Autowired
    private UserService userService;

    @PostMapping("/{departmentId}")
    public ResponseEntity<UserDTO> saveUser(@RequestBody UserDTO userDTO, @PathVariable String departmentId)
    {
        log.info("inside saveUser API");
        UserDTO added = userService.saveUser(userDTO, departmentId);
        return new ResponseEntity<>(added, CREATED);
    }


}
