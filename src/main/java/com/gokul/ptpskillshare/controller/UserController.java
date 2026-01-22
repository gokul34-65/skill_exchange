package com.gokul.ptpskillshare.controller;

import com.gokul.ptpskillshare.model.User;
import com.gokul.ptpskillshare.service.UserService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/create")
    public List<User> createUser(@Valid @RequestBody User user) {
        return userService.createUser(user);
    }

    @DeleteMapping("/{userId}/{skillId}")
    public ResponseEntity<String> removeTeachingSkill( @PathVariable String userId, @PathVariable String skillId ){
        return userService.removeTeachingSkill(userId, skillId);
    }
}

