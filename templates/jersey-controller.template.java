package @@moduleName@@;

import javax.annotation.Nonnull;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import java.util.List;

import com.codahale.metrics.annotation.Timed;

import static java.util.Objects.requireNonNull;

@Path("api/todo")
@Produces(MediaType.APPLICATION_JSON)
public class @@name@@WebService {

    private final @@name@@Service service;

    /**
     * An injectable constructor.
     *
     * @param service a service to store and retrieve {@link @@name@@}s
     */
    @Inject
    public @@name@@WebService(
            @Nonnull @@name@@Service service
    ) {
        this.service = requireNonNull(service);
    }

    @GET
    @Path("{id}")
    @Timed
    public @@name@@ getById(
            @PathParam("id") String id
    ) {
        return service.getById(id);
    }

    @GET
    @Timed
    public List<@@name@@> getAll() {
        return service.getAll();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Timed
    public @@name@@ create(
            @@name@@ toCreate
    ) {
        return service.create(toCreate);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("{id}")
    @Timed
    public @@name@@ update(
            @PathParam("id") String id,
            @@name@@ toUpdate
    ) {
        // TODO - validate id & o.getId() match
        return service.update(toUpdate);
    }

    @DELETE
    @Path("{id}")
    @Timed
    public void delete(
            @PathParam("id") String id
    ) {
        service.delete(id);
    }

}
