package @@moduleName@@;


@Path("api/todo")
@Produces(MediaType.APPLICATION_JSON)
public class @@name@@ {

    private final Object service;

    @Inject
    public @@name@@(
        Object service
    ) {
        this.service = service;
    }

    @GET
    @Path("{id}")
    public Object getById(
        @PathParam("id") String id
    ) {
        return service.getById(id);
    }

    @GET
    public List<Object> getAll() {
        return service.getAll();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Object create(
        Object o
    ) {
        return service.create(o);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Object update(
        @PathParam("id") String id,
        Object o
    ) {
        // TODO - validate id & o.getId() match
        return service.update(o);
    }

    @DELETE
    @Path("{id}")
    public void delete(
        @PathParam("id") String id
    ) {
        service.delete(id);
    }

}