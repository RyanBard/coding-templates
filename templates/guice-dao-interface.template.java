package @@moduleName@@;

import java.util.List;


public interface @@name@@ {

    Object getById(String id);

    List<Object> getAll();

    String create(Object o);

    Object update(Object o);

    void delete(String id);

}
