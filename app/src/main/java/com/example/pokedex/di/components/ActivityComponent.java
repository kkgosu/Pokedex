package com.example.pokedex.di.components;

import android.content.Context;

import com.example.model.controllers.AssetsController;
import com.example.model.controllers.GsonController;
import com.example.model.datasources.PokemonLocalDatasource;
import com.example.model.datastores.PokemonDatastore;
import com.example.model.transformers.PokemonTransformer;
import com.example.pokedex.activities.BaseActivity;
import com.example.pokedex.annotations.PerActivity;
import com.example.pokedex.controllers.TransitionController;
import com.example.pokedex.di.modules.ActivityModule;
import com.example.pokedex.di.modules.ControllersModule;
import com.example.pokedex.di.modules.DataModule;
import com.example.pokedex.di.modules.TransformerModule;

import javax.inject.Named;

import dagger.Component;

/**
 * Created by Konstantin Koval on 02.04.2020
 */

@PerActivity
@Component(modules = {ActivityModule.class, ControllersModule.class, TransformerModule.class, DataModule.class},
        dependencies = {ApplicationComponent.class})
public interface ActivityComponent {

    BaseActivity baseActivity();

    @Named("Activity")
    Context activityContext();

    GsonController gsonController();

    TransitionController transitionController();

    PokemonTransformer pokemonTransformer();

    AssetsController assetsController();

    PokemonLocalDatasource pokemonLocalDatasource();

    PokemonDatastore pokemonDatastore();
}
