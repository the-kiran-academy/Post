package com.jbk.entity;

import javax.persistence.*;

@Entity
@Table(name = "comments")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comment_id")
    private Long commentId;

    @Column(name = "text")
    private String text;

    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;

    // Constructors, getters, setters, etc.
}
