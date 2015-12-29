package @@moduleName@@;

import javax.inject.Singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;


/**
 * A guice module to configure the daos and services for {@link @@name@@}s.
 */
public class @@name@@GuiceModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(@@name@@Dao.class).to(Mock@@name@@Dao.class);
        bind(@@name@@Service.class).to(Default@@name@@Service.class);
    }

    @Provides
    @Singleton
    private AtomicInteger provideIdSequence() {
        return new AtomicInteger(0);
    }

    @Provides
    @Singleton
    private Map<String, @@name@@> provideDataStore() {
        return new ConcurrentHashMap<>();
    }

}
