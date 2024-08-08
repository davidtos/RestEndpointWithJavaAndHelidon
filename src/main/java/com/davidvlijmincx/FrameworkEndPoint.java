package com.davidvlijmincx;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

import java.util.List;

@Path("frameworks")
public class FrameworkEndPoint {


    @GET
    public List<String> getFrameworks() {
        return List.of("Helidon","Quakrus", "micronaut");
    }


    @GET
    @Path("someData")
    public SomeData someData() {
        return new SomeData("Helidon","It is a great framework to work with",5);
    }
}
