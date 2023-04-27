package com.terminator;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
public class HelloResource {

    @GET
    @Path("hello")
    public String hello() {
        return "Hello from Telemetry testing API";
    }
}
