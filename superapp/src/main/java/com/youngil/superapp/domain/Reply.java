package com.youngil.superapp.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor
public class Reply extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, unique = true)
    private String id;

    @Column(name = "content", nullable = false)
    private String content;

    @Column(name = "depth", nullable = false)
    private Integer depth;

    @ManyToOne
    @JoinColumn(name="parent_id")
    private Reply reply;
}
