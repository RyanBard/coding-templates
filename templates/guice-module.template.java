package @@moduleName@@;


public class @@name@@ extends AbstractModule {

    @Override
    protected void configure() {
        bind(TodoDao.class).to(MockTodoDao.class);
        bind(TodoService.class).to(DefaultTodoService.class);
    }

}
