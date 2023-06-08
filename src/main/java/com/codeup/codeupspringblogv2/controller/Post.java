package com.codeup.codeupspringblogv2.controller;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Controller;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Entity
@Table(name ="posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,length = 225)
    private String title;
    @Column(nullable = false)
    private String body;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


    public Post(String title, String body) {
        this.title = title;
        this.body = body;
    }
}
