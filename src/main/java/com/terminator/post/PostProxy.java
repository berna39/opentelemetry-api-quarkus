package com.terminator.post;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import java.util.List;

@RegisterRestClient(baseUri = "https://jsonplaceholder.typicode.com/")
@Produces(MediaType.APPLICATION_JSON)
public interface PostProxy {
    @GET
    @Path("/posts")
    List<Post> fetch();
}
