package com.mygu.mygube.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Table(name = "posts")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Post {
    @Id
    @GeneratedValue
    private int id;

    @ElementCollection
    @Column(name = "images", columnDefinition = "varchar[]")
    private List<String> images;

    @Column(name = "caption")
    private String caption;

    @Column(name = "number_of_likes")
    private int numberOfLikes = 0;

    @Column(name = "location")
    private String location;

    @Column(name = "user_id")
    private UUID userId;

    @OneToMany
    private List<Post> posts = new ArrayList<>();
}
