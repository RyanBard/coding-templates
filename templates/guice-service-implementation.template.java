package @@moduleName@@;

import java.util.List;


public class Default@@name@@ implements @@name@@ {

    private final Object dao;

    @Inject
    public Default@@name@@(
        Object dao
    ) {
        this.dao = dao;
    }

    @Override
    public Object getById(
        String id
    ) {
        return dao.getById(id);
    }

    @Override
    public List<Object> getAll() {
        return dao.getAll();
    }

    @Override
    public Object create(
        Object o
    ) {
        String id = dao.create(o);
        // TODO - mutate old object or make new object with ID from DB
        return oWithId;
    }

    @Override
    public Object update(
        Object o
    ) {
        dao.update(o);
        return o;
    }

    @Override
    public void delete(
        String id
    ) {
        dao.delete(id);
    }

}
