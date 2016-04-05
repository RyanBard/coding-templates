package @@moduleName@@;

import javax.annotation.Nonnull;

import java.util.List;

/**
 * A dao for storing and retrieving {@link @@name@@}s.
 */
public interface @@name@@Dao {

    /**
     * Retrieves a {@link @@name@@} by its id.
     *
     * @param id the id of the {@link @@name@@}
     * @return the {@link @@name@@}
     * @throws RuntimeException if the {@link @@name@@} wasn't found
     * @throws NullPointerException if id is null
     */
    @@name@@ getById(@Nonnull String id);

    /**
     * Retrieves all {@link @@name@@}s.
     *
     * @return the {@link @@name@@}s.
     */
    List<@@name@@> getAll();

    /**
     * Creates a new {@link @@name@@}.
     *
     * @param toCreate the {@link @@name@@} to create
     * @return the id of the newly created {@link @@name@@}
     * @throws NullPointerException if toCreate was null
     */
    String create(@Nonnull @@name@@ toCreate);

    /**
     * Updates an existing {@link @@name@@}.
     *
     * @param toUpdate the {@link @@name@@} to update
     * @throws NullPointerException if toUpdate or toUpdate.getId() was null
     */
    void update(@Nonnull @@name@@ toUpdate);

    /**
     * Deletes a {@link @@name@@}.
     *
     * @param id the id of the {@link @@name@@}
     * @throws NullPointerException if id was null
     */
    void delete(@Nonnull String id);

}
