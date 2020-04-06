package com.example.pokedex.fragments.detail.interactor;

import com.example.model.models.Pokemon;

/**
 * @author Konstantin Koval
 * @since 07.04.2020
 */
public interface LoadPokemonDataInteractor {
    Pokemon execute(int pokemonId);
}
