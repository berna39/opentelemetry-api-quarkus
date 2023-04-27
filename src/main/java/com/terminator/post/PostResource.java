package com.terminator.post;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import java.util.List;

@Path("/ext/posts")
@Produces(MediaType.APPLICATION_JSON)
public class PostResource {

    @RestClient
    PostProxy postProxy;

    @GET
    public Response posts(){
        List<Post> posts = postProxy.fetch();
        return Response.ok(posts).build();
    }
}
