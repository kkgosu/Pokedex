package com.example.pokedex.di.modules;

import com.example.model.transformers.PokemonTransformer;
import com.example.model.transformers.PokemonTransformerImpl;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * @author Konstantin Koval
 * @since 06.04.2020
 */
@Module
public class TransformerModule {
    @Provides
    @Singleton
    public PokemonTransformer providePokemonTransformer(PokemonTransformerImpl pokemonTransformer) {
        return pokemonTransformer;
    }
}
