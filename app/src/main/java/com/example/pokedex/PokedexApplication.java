package com.example.pokedex;

import android.app.Application;

import com.example.pokedex.util.timber.DebugTree;
import com.example.pokedex.util.timber.ReleaseTree;

import timber.log.Timber;

public class PokedexApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Timber.plant(BuildConfig.DEBUG ? new DebugTree() : new ReleaseTree());
    }
}
