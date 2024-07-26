package com.mygu.mygube.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Table(name = "users")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue
    private UUID id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "gender_id", insertable=false, updatable=false)
    private int genderId;

    @Column(name = "address")
    private String address;

    @ManyToOne
    private Gender gender = null;
}
