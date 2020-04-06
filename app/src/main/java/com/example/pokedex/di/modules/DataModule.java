package com.example.pokedex.di.modules;

import com.example.model.datasources.PokemonLocalDatasource;
import com.example.model.datasources.PokemonLocalDatasourceImpl;
import com.example.model.datastores.PokemonDatastore;
import com.example.model.datastores.PokemonDatastoreImpl;
import com.example.pokedex.annotations.PerActivity;

import dagger.Module;
import dagger.Provides;

/**
 * @author Konstantin Koval
 * @since 06.04.2020
 */
@Module
public class DataModule {

    @Provides
    @PerActivity
    public PokemonDatastore providePokemonDatastore(PokemonDatastoreImpl pokemonDatastore) {
        return pokemonDatastore;
    }

    @Provides
    @PerActivity
    public PokemonLocalDatasource providePokemonLocalDatasource(PokemonLocalDatasourceImpl pokemonLocalDatasource) {
        return pokemonLocalDatasource;
    }
}
