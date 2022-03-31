package com.valen.javaee.controller;


import com.valen.javaee.dao.impl.BlogDAOImpl;
import com.valen.javaee.model.Blog;
import jakarta.inject.Inject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.List;

@Path("/api")
public class BlogController {

    @Inject
    BlogDAOImpl blogDAO;

    @GET
    @Path("/list")
    @Produces("application/json")
    List<Blog> getBlogs(){
        return blogDAO.blogs();
    }
}
