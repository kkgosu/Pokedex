package com.example.pokedex.di.components;

import android.content.Context;

import com.example.model.controllers.AssetsController;
import com.example.model.controllers.GsonController;
import com.example.model.datasources.PokemonLocalDatasource;
import com.example.model.datastores.PokemonDatastore;
import com.example.model.transformers.PokemonTransformer;
import com.example.pokedex.PokedexApplication;
import com.example.pokedex.di.modules.ApplicationModule;
import com.example.pokedex.di.modules.ControllersModule;
import com.example.pokedex.di.modules.DataModule;
import com.example.pokedex.di.modules.TransformerModule;
import com.google.gson.Gson;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Konstantin Koval on 02.04.2020
 */
@Singleton
@Component(modules = {ApplicationModule.class, ControllersModule.class, TransformerModule.class, DataModule.class})
public interface ApplicationComponent {

    PokedexApplication pokedexApplication();

    @Named("Application")
    Context applicationContext();

    Gson gson();

    GsonController gsonController();

    PokemonTransformer pokemonTransformer();

    AssetsController assetsController();

    PokemonLocalDatasource pokemonLocalDatasource();

    PokemonDatastore pokemonDatastore();
}
