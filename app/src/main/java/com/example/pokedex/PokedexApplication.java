package com.example.pokedex;

import android.app.Application;

import com.example.pokedex.di.components.ApplicationComponent;
import com.example.pokedex.di.components.DaggerApplicationComponent;
import com.example.pokedex.di.modules.ApplicationModule;
import com.example.pokedex.di.modules.ControllersModule;
import com.example.pokedex.util.timber.DebugTree;
import com.example.pokedex.util.timber.ReleaseTree;

import timber.log.Timber;

public class PokedexApplication extends Application {

    private ApplicationComponent mApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        setupDI();
        Timber.plant(BuildConfig.DEBUG ? new DebugTree() : new ReleaseTree());
    }

    public ApplicationComponent getApplicationComponent() {
        return mApplicationComponent;
    }

    private void setupDI() {
        mApplicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .controllersModule(new ControllersModule())
                .build();
    }
}
