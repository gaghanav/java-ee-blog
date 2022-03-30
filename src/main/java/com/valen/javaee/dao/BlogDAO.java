package com.valen.javaee.dao;

import java.util.List;

import javax.persistence.Entity;

@Entity
public class BlogDAO {
	private Integer id;
	private List<BlogDAO> daos;
}
