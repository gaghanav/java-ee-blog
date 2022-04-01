package com.valen.javaee.controller;


import com.valen.javaee.dao.impl.BlogDAOImpl;
import com.valen.javaee.model.Blog;
import jakarta.inject.Inject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/blog")
public class BlogController {

    @Inject
    BlogDAOImpl blogDAO;

    @GET
    @Path("/list")
    @Produces("application/json")
    public Response getBlogs(){
        System.out.println("nge hit blogs");
        return Response.ok().entity("Nge hit blogs").build();
    }
}
