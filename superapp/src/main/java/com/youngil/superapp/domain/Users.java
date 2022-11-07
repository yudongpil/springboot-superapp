package com.youngil.superapp.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor
public class Users extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, unique = true)
    private String id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "is_admin", nullable = false)
    private Boolean is_admin;

    @ManyToOne
    @JoinColumn(name="like_id")
    private Likes like;

}
