package com.valen.javaee.dao;

import javax.persistence.Entity;

@Entity
public class ArticleDAO {
	private Integer id;
	private String title;
	private String content;
	private BlogDAO blogDAO;
}
