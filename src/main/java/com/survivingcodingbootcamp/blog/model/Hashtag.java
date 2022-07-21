package com.survivingcodingbootcamp.blog.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Arrays;
import java.util.Collection;
@Entity
public class Hashtag {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    @ManyToMany(mappedBy = "hashtags")
    private Collection<Post> posts;



    public Hashtag(String name, Post... posts) {
        this.name = name;
        this.posts = Arrays.asList(posts);
    }


    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public Hashtag(){

    }
    public Collection<Post> getPosts() {return posts;}


    }

