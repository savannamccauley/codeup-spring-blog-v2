package com.codeup.codeupspringblogv2.models;

import com.codeup.codeupspringblogv2.models.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
    @Column(nullable = false, columnDefinition = "TEXT")
    private String body;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


    public Post(String title, String body) {
        this.title = title;
        this.body = body;
    }
}
