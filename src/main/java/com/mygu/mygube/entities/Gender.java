package com.mygu.mygube.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Table(name = "genders")
@Entity
@Getter
public class Gender {
    @Id
    private int id;

    private String name;

    @OneToMany
    private List<User> users = new ArrayList<User>();
}
