package br.com.comparacel.resource;

import br.com.comparacel.dto.RespostaStatus;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/")
public class StatusResource {

    @GET
    @Path("/up")
    @Produces(MediaType.APPLICATION_JSON)
    public RespostaStatus up() {
        return new RespostaStatus("Funciona");
    }

    @GET
    @Path("/teste")
    @Produces(MediaType.APPLICATION_JSON)
    public RespostaStatus healthz() {
        return new RespostaStatus("Funciona");
    }
}