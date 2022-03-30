package com.valen.javaee.model;


import com.valen.javaee.dao.BlogDAO;

import javax.persistence.Entity;

@Entity
public class Article {
    private Integer id;
    private String title;
    private String content;
    private BlogDAO blogDAO;
}
