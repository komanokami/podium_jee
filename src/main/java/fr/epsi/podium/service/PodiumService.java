package fr.epsi.podium.service;

import fr.epsi.podium.model.Podium;
import fr.epsi.podium.model.Search;
import fr.epsi.podium.model.Vote;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URISyntaxException;

/**
 * Created by borombo on 01/06/2017.
 */
@Path("/podium")
public class PodiumService {

    @GET
    public Response getHome(){
        return Response.noContent().build();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createPodium(Podium podium) throws URISyntaxException {
        return Response.ok().build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{id}")
    public Response getPodium(@PathParam("id") Integer id){
        //TODO Retreive the podium by id
        return Response.ok().build();
    }

/*    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Response vote(String id, Vote vote) throws URISyntaxException {
        return Response.ok().build();
    }*/

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/trending")
    public Response getTrending(){
        return Response.ok().build();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Response createBook(Search search) throws URISyntaxException {
        return Response.ok().build();
    }

    @DELETE
    @Path("/{id}")
    public Response deletePodium(@PathParam("id") Integer id) {
        return Response.ok().build();
    }
}