package com.valen.javaee.dao.impl;

import com.valen.javaee.dao.ArticleDAO;
import com.valen.javaee.dao.BlogDAO;
import com.valen.javaee.model.Blog;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class BlogDAOImpl implements BlogDAO {



    @Override
    public void save(Blog blog) {

    }

    @Override
    public void update(Blog blog) {

    }

    @Override
    public List<Blog> blogs() {
        List<Blog> blogs = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            Blog blog = new Blog();
            blog.setId(i);
            blogs.add(blog);
        }
        return blogs;
    }

    @Override
    public void delete(Integer id) {

    }
}
