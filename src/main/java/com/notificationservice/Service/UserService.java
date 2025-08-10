package com.notificationservice.Service;

import com.notificationservice.Dto.UserDto;
import com.notificationservice.Entity.User;
import com.notificationservice.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    public Long addUser(UserDto userDto){
        User user = new User();
        user.setUserEmail(userDto.getUserEmail());
        user.setPassword(userDto.getUserEmail());
        Long userId = userRepo.save(user).getUserId();
        return userId;
    }
}
