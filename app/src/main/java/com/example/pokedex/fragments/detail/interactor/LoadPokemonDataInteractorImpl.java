package com.example.pokedex.fragments.detail.interactor;

import com.example.model.datastores.PokemonDatastore;
import com.example.model.models.Pokemon;

import javax.inject.Inject;

/**
 * @author Konstantin Koval
 * @since 07.04.2020
 */
public class LoadPokemonDataInteractorImpl implements LoadPokemonDataInteractor {

    @Inject
    PokemonDatastore mPokemonDatastore;

    @Inject
    public LoadPokemonDataInteractorImpl() {
    }

    @Override
    public Pokemon execute(int pokemonId) {
        return mPokemonDatastore.getPokemonById(pokemonId);
    }
}
