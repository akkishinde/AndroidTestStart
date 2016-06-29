package io.leftshift.androidteststart;

import android.app.Application;

import io.leftshift.androidteststart.modules.AndroidTestDependency;
import io.leftshift.androidteststart.modules.AppModule;
import io.leftshift.androidteststart.modules.DaggerAndroidTestDependency;

public class AndroidTestApplication extends Application {


    private AndroidTestDependency androidTestDependency;

    @Override
    public void onCreate() {
        super.onCreate();
        androidTestDependency = DaggerAndroidTestDependency.builder()
                .appModule(new AppModule(getApplicationContext()))
                .build();

    }

    public AndroidTestDependency getComponent() {
        return androidTestDependency;
    }

    public void setGoDriverDepsBuilder(AndroidTestDependency androidTestDependency) {
        this.androidTestDependency = androidTestDependency;
    }
}
