package com.terminator.post;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/api/posts")
@Produces(MediaType.APPLICATION_JSON)
public class PostResource {

    @Inject
    PostProxy postProxy;

    @GET
    public Response posts(){
        List<Post> posts = postProxy.get();
        return Response.ok(posts).build();
    }
}
