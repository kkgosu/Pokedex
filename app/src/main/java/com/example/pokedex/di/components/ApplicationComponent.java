package com.example.pokedex.di.components;

import android.content.Context;

import com.example.model.controllers.AssetsController;
import com.example.model.controllers.GsonController;
import com.example.pokedex.PokedexApplication;
import com.example.pokedex.di.modules.ApplicationModule;
import com.example.pokedex.di.modules.ControllersModule;
import com.google.gson.Gson;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Konstantin Koval on 02.04.2020
 */
@Singleton
@Component(modules = {ApplicationModule.class, ControllersModule.class})
public interface ApplicationComponent {

    PokedexApplication pokedexApplication();

    @Named("Application")
    Context applicationContext();

    Gson gson();

    GsonController gsonController();

    AssetsController assetsController();
}
