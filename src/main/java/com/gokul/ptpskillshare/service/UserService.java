package com.gokul.ptpskillshare.service;

import com.gokul.ptpskillshare.model.User;
import com.gokul.ptpskillshare.repository.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> createUser(User user) {
        userRepository.save(user);
        return userRepository.findAll();
    }

    public ResponseEntity<Void> deleteUserSkill(String userId, String skillId){

    }

}
