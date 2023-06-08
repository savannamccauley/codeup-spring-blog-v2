package com.codeup.codeupspringblogv2.repositories;

import com.codeup.codeupspringblogv2.controller.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {

}
