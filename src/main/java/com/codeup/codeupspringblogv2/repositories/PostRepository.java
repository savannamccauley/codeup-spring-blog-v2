package com.codeup.codeupspringblogv2.repositories;

import com.codeup.codeupspringblogv2.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {

    Post findByTitle(String adsToBeDeleted);
}
