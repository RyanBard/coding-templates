package @@moduleName@@;

import javax.annotation.Nonnull;
import javax.inject.Inject;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import static java.util.Objects.requireNonNull;


/**
 * A mock implementation of {@link @@name@@Dao} that uses a {@link Map} for its datastore.
 */
public class Mock@@name@@Dao implements @@name@@Dao {

    private final AtomicInteger idSequence;
    private final Map<String, @@name@@> dataStore;

    /**
     * An injectable constructor.
     *
     * @param idSequence an {@link AtomicInteger} for id sequences
     * @param dataStore a {@link Map} for storing and retrieving {@link @@name@@}s
     */
    @Inject
    public Mock@@name@@Dao(
            @Nonnull AtomicInteger idSequence,
            @Nonnull Map<String, @@name@@> dataStore
    ) {
        this.idSequence = requireNonNull(idSequence);
        this.dataStore = requireNonNull(dataStore);
    }

    @Override
    public @@name@@ getById(
            @Nonnull String id
    ) {
        if (!dataStore.containsKey(requireNonNull(id))) {
            throw new RuntimeException("not found: " + id);
        }
        return dataStore.get(id);
    }

    @Override
    public List<@@name@@> getAll() {
        return new ArrayList<>(dataStore.values());
    }

    @Override
    public String create(
            @Nonnull @@name@@ toCreate
    ) {
        requireNonNull(toCreate);
        String id = "" + idSequence.incrementAndGet();
        toCreate.setId(id);
        dataStore.put(id, toCreate);
        return id;
    }

    @Override
    public void update(
            @Nonnull @@name@@ toUpdate
    ) {
        dataStore.put(toUpdate.getId(), toUpdate);
    }

    @Override
    public void delete(
            @Nonnull String id
    ) {
        dataStore.remove(requireNonNull(id));
    }

}
