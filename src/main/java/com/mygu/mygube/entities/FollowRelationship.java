package com.mygu.mygube.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Table(name = "follow_relationship")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@IdClass(FollowRelationship.FollowRelationshipId.class)
public class FollowRelationship {
    public abstract class FollowRelationshipId {
        private UUID followerId;
        private UUID userId;
    }
    @Id
    @Column(name = "follower_id")
    private UUID followerId;

    @Id
    @Column(name = "user_id")
    private UUID userId;
}
