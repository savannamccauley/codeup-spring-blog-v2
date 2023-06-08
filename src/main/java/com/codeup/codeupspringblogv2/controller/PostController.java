package com.codeup.codeupspringblogv2.controller;

import com.codeup.codeupspringblogv2.repositories.PostRepository;
import com.codeup.codeupspringblogv2.repositories.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PostController {
    private final PostRepository postDao;
    private final UserRepository userDao;


    public PostController(PostRepository postDao, UserRepository userDao) {
        this.postDao = postDao;
        this.userDao = userDao;

    }

    @GetMapping("/posts")
    public String allPost(Model model) {
        model.addAttribute("posts", postDao.findAll());

        return "/posts/index";
    }

    @GetMapping("/posts/{id}")
    public String singlePost(@PathVariable long id, Model model) {
        model.addAttribute("post", postDao.findById(id).get());
        return "/posts/show";
    }

    @GetMapping("/posts/create")
    public String createPost(Model model) {
        model.addAttribute("post", new Post());
        return "/posts/create";
    }

    @PostMapping("/posts/create")
    public String createNewPost(@ModelAttribute Post post) {
        User user = userDao.findById(1L).get();
        post.setUser(user);
        postDao.save(post);
        return "redirect:/posts";
    }

    @GetMapping("/posts/{id}/edit")
    public String showEditForm(@PathVariable long id, Model model) {
        Post postEdit = postDao.findById(id).orElse(null);
        if (postEdit == null) {
            return "error";
        }
        model.addAttribute("post", postEdit);
        return "/posts/create";
    }
//    @PostMapping("/posts/{id}/edit")

    @PostMapping("/posts/{id}/edit")
    public String updatePost(@ModelAttribute Post newPost){
        User user = userDao.findById(1l).get();
        newPost.setUser(user);
        postDao.save(newPost);
        return "redirect:/posts";
    }

}

