package com.fat.houndeye;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("rcon")
public class RconService {
    @Inject
    private Rcon rcon;

    @Path("{id}")
    @GET
    public Response connect() {
        return Response.ok().build();
    }
}
