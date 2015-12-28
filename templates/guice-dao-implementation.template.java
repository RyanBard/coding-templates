package @@moduleName@@;

import javax.inject.Inject;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class Mock@@name@@ implements @@name@@ {

    private final AtomicInteger idSequence;
    private final Map<String, Object> dataStore;

    @Inject
    public Mock@@name@@(
        AtomicInteger idSequence,
        Map<String, Object> dataStore
    ) {
        this.idSequence = idSequence;
        this.dataStore = dataStore;
    }

    @Override
    public Object getById(
        String id
    ) {
        if (!dataStore.containsKey(id)) {
            throw new RuntimeException("not found: " + id);
        }
        return dataStore.get(id);
    }

    @Override
    public List<Object> getAll() {
        return new ArrayList<>(dataStore.values());
    }

    @Override
    public String create(
        Object o
    ) {
        String id = "" + idSequence.incrementAndGet();
        // TODO - set the ID in the object before putting into the map
        dataStore.put(id, o);
        return id;
    }

    @Override
    public Object update(
        Object o
    ) {
        dataStore.put(o.getId(), o);
        return o;
    }

    @Override
    public void delete(
        String id
    ) {
        dataStore.remove(id);
    }

}
