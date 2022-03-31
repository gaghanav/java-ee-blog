package com.valen.javaee.dao;


import com.valen.javaee.model.Article;

import java.util.List;

public interface ArticleDAO {
    void save(Article article);
    void update(Article article);
    List<Article> articles();
    void delete(Integer id);
}
