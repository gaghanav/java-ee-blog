package com.valen.javaee.dao;


import com.valen.javaee.model.Blog;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;


public interface BlogDAO {
    void save(Blog blog);
    void update(Blog blog);
    List<Blog> blogs();
    void delete(Integer id);
}
