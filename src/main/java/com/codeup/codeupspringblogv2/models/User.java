package com.codeup.codeupspringblogv2.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, columnDefinition = "VARCHAR(100)")
    private String username;
    @Column(nullable = false, columnDefinition = "VARCHAR(100)")

    private String email;
    @Column(nullable = false)
    private String password;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    List<Post> posts;

    public User(User copy){
        id=copy.id;
        email = copy.email;
        username = copy.username;
        password = copy.password;
    }

}
