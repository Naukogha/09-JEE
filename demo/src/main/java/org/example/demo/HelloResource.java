package org.example.demo;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

@Path("/hello-world")
public class HelloResource {
    @GET
    @Produces("text/plain")
    public String hello() {
        return "Hello, World!";
    }

    @GET
    @Path("/hello-json")
    @Produces("application/json")
    public String helloJson(){
        return "Hello, JSON !";
    }

    @GET
    @Path("/json")
    @Produces("application/json")
    public String json(){
        return "Hello, JSON !";
    }
}