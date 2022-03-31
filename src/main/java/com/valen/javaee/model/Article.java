package com.valen.javaee.model;


import com.valen.javaee.dao.BlogDAO;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
@Getter
@Setter
public class Article {
    @Id
    private Integer id;
    private String title;
    private String content;
    @OneToMany
    private BlogDAO blogDAO;
}
