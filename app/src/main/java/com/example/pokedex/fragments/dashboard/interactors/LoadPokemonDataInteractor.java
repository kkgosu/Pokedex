package com.example.pokedex.fragments.dashboard.interactors;

import com.example.model.models.Pokemon;

import java.util.List;

/**
 * @author Konstantin Koval
 * @since 06.04.2020
 */
public interface LoadPokemonDataInteractor {

    List<Pokemon> execute();
}
