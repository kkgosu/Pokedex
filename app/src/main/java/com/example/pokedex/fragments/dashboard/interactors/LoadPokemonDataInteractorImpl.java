package com.example.pokedex.fragments.dashboard.interactors;

import com.example.model.datastores.PokemonDatastore;
import com.example.model.models.Pokemon;

import java.util.List;

import javax.inject.Inject;

/**
 * @author Konstantin Koval
 * @since 06.04.2020
 */
public class LoadPokemonDataInteractorImpl implements LoadPokemonDataInteractor {

    @Inject
    PokemonDatastore mPokemonDatastore;

    @Inject
    public LoadPokemonDataInteractorImpl() {
    }

    @Override
    public List<Pokemon> execute() {
        return mPokemonDatastore.getPokemon();
    }
}
