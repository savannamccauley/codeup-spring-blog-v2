package com.codeup.codeupspringblogv2.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Controller;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Post {
    private Long id;
    private String title;
    private String body;


}
