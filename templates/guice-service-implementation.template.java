package @@moduleName@@;

import javax.annotation.Nonnull;
import javax.inject.Inject;

import java.util.List;

import com.codahale.metrics.annotation.Timed;

import static java.util.Objects.requireNonNull;


/**
 * A default implementation of {@link @@name@@Service}.
 */
public class Default@@name@@Service implements @@name@@Service {

    private final @@name@@Dao dao;

    /**
     * An injectable constructor.
     *
     * @param dao the dao to store and retrieve {@link @@name@@}s
     */
    @Inject
    public Default@@name@@Service(
            @Nonnull @@name@@Dao dao
    ) {
        this.dao = requireNonNull(dao);
    }

    @Override
    @Timed
    public @@name@@ getById(
            @Nonnull String id
    ) {
        // TODO - validate input
        return dao.getById(id);
    }

    @Override
    @Timed
    public List<@@name@@> getAll() {
        return dao.getAll();
    }

    @Override
    @Timed
    public @@name@@ create(
            @Nonnull @@name@@ toCreate
    ) {
        // TODO - validate input
        String id = dao.create(toCreate);
        return getById(id);
    }

    @Override
    @Timed
    public @@name@@ update(
            @Nonnull @@name@@ toUpdate
    ) {
        // TODO - validate input
        dao.update(toUpdate);
        return getById(toUpdate.getId());
    }

    @Override
    @Timed
    public void delete(
            @Nonnull String id
    ) {
        // TODO - validate input
        dao.delete(id);
    }

}
