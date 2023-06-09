package com.codeup.codeupspringblogv2.repositories;

import com.codeup.codeupspringblogv2.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User,Long> {
    User findByUsername(String username);
}
