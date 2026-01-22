package com.gokul.ptpskillshare.repository;

import com.gokul.ptpskillshare.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {

}
