package io.leftshift.androidteststart.modules;

import javax.inject.Singleton;

import dagger.Component;
import io.leftshift.androidteststart.MainActivity;

@Singleton
@Component(modules = {
        AppModule.class,
        NetworkModule.class,
})
public interface AndroidTestDependency {
    void inject(MainActivity mainActivity);
}



