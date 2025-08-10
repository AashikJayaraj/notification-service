package com.notificationservice.Controller;

import com.notificationservice.Dto.UserDto;
import com.notificationservice.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    //

    @Autowired
    UserService userService;

    @PostMapping("/addUser")
    public ResponseEntity<String> addUser(@RequestBody UserDto userDto){
        String id= String.valueOf(userService.addUser(userDto));
        return new ResponseEntity<>(id, HttpStatus.OK);
    }
}
