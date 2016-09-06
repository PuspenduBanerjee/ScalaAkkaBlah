package com.me.finalization.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by Puspendu on 8/31/2016.
 */
    @Path("/")
    public interface FinalizationResource {

        @GET
        @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
        DummyResponse getInfo();


    }