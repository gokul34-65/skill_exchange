package com.gokul.ptpskillshare.service;

import com.gokul.ptpskillshare.model.Skill;
import com.gokul.ptpskillshare.model.User;
import com.gokul.ptpskillshare.repository.SkillRepository;
import com.gokul.ptpskillshare.repository.UserRepository;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final SkillRepository skillRepository;

    public UserService(UserRepository userRepository , SkillRepository skillRepository) {
        this.userRepository = userRepository;
        this.skillRepository = skillRepository;
    }

    public List<User> createUser(User user) {
        userRepository.save(user);
        return userRepository.findAll();
    }

    public ResponseEntity<String> removeTeachingSkill(String userId , String skillId){
        if(! userRepository.existsById(userId)){
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
        }
        User user = userRepository.getReferenceById(userId);
        List<Skill> skills = user.getTeaching();
        List<Skill> newSkills = new ArrayList<>();
        for(Skill skill : skills){
            if(skill.getSkillId().equals(skillId)){
                continue;
            }
            newSkills.add(skill);
        }
        user.setTeaching(newSkills);
        userRepository.save(user);
        return ResponseEntity.ok("Teaching skills deleted successfully");
    }

}
