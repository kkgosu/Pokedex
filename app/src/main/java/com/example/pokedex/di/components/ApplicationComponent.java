package com.example.pokedex.di.components;

import android.content.Context;

import com.example.pokedex.PokedexApplication;
import com.example.pokedex.di.modules.ApplicationModule;
import com.google.gson.Gson;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Konstantin Koval on 02.04.2020
 */
@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {

    PokedexApplication pokedexApplication();

    @Named("Application")
    Context applicationContext();

    Gson gson();


}
