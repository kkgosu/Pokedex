package com.example.pokedex.di.modules;

import com.example.model.datasources.PokemonLocalDatasource;
import com.example.model.datasources.PokemonLocalDatasourceImpl;
import com.example.model.datastores.PokemonDatastore;
import com.example.model.datastores.PokemonDatastoreImpl;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * @author Konstantin Koval
 * @since 06.04.2020
 */
@Module
public class DataModule {

    @Provides
    @Singleton
    public PokemonDatastore providePokemonDatastore(PokemonDatastoreImpl pokemonDatastore) {
        return pokemonDatastore;
    }

    @Provides
    @Singleton
    public PokemonLocalDatasource providePokemonLocalDatasource(PokemonLocalDatasourceImpl pokemonLocalDatasource) {
        return pokemonLocalDatasource;
    }
}
