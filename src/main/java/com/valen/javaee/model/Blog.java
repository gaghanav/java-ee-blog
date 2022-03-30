package com.valen.javaee.model;

import java.util.List;

import javax.persistence.Entity;

@Entity
public class Blog {
    private Integer id;
    private List<Article> articles;
}
