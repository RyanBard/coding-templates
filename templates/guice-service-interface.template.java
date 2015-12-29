package @@moduleName@@;

import java.util.List;


/**
 * A service for storing and retrieving {@link @@name@@}s.
 */
public interface @@name@@Service {

    /**
     * Retrieves a {@link @@name@@} by its id.
     *
     * @param id the id of the {@link @@name@@}
     * @return the {@link @@name@@}
     * @throws RuntimeException if the {@link @@name@@} wasn't found
     * @throws NullPointerException if id is null
     */
    @@name@@ getById(String id);

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
     * @return the newly created {@link @@name@@}
     * @throws RuntimeException if the toCreate wasn't valid
     * @throws NullPointerException if toCreate was null
     */
    @@name@@ create(@@name@@ toCreate);

    /**
     * Updates an existing {@link @@name@@}.
     *
     * @param toUpdate the {@link @@name@@} to update
     * @return the updated {@link @@name@@}
     * @throws RuntimeException if toUpdate wasn't valid
     * @throws NullPointerException if toUpdate or toUpdate.getId() was null
     */
    @@name@@ update(@@name@@ toUpdate);

    /**
     * Deletes a {@link @@name@@}.
     *
     * @throws NullPointerException if id was null
     */
    void delete(String id);

}
