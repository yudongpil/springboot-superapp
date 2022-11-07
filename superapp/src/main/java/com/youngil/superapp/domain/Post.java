package com.youngil.superapp.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor
public class Post extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, unique = true)
    private String id;

    @Column(name = "content", nullable = false)
    private String content;

    @Column(name = "title", nullable = false)
    private String title;

    @ManyToOne
    @JoinColumn(name="user_id")
    private Users users;

    @ManyToOne
    @JoinColumn(name="board_id")
    private Board board;

}