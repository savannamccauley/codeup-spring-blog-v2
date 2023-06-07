package com.codeup.codeupspringblogv2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class PostController {
    @GetMapping("/posts")
    public String allPost(){
        return "/posts/index";
    }
    @GetMapping("/posts/{id}")
    public String individualPost(@PathVariable("id") Long id, Model model){
        Post post = new Post(id, "sample post", "sample");
        model.addAttribute("post",post);
        return "posts/show";
    }
    @GetMapping("/posts/create")
    @ResponseBody
    public String createPost(){
        return "View the form for creating a post";
    }
    @PostMapping("/posts/create")
    @ResponseBody
    public String createNewPost(){
        return "Create a new post";
    }

}

