package com.davidvlijmincx;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

import java.util.List;

@Path("frameworks")
public class CarEndPoint {


    @GET
    public List<String> getFrameworks() {
        return List.of("Helidon","Quakrus", "micronaut");
    }
}
