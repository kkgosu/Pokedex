package com.example.pokedex.di.modules;

import android.content.Context;

import com.example.pokedex.PokedexApplication;
import com.google.gson.Gson;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Konstantin Koval on 02.04.2020
 */

@Module
public class ApplicationModule {

    private PokedexApplication mPokedexApplication;

    public ApplicationModule(PokedexApplication pokedexApplication) {
        mPokedexApplication = pokedexApplication;
    }

    @Provides
    @Singleton
    PokedexApplication providePokedexApplication() {
        return mPokedexApplication;
    }

    @Provides
    @Singleton
    @Named("Application")
    Context provideApplicationContext() {
        return mPokedexApplication;
    }

    @Provides
    @Singleton
    Gson provideGson() {
        return new Gson();
    }
}
