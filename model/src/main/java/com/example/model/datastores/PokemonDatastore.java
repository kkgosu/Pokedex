package com.example.model.datastores;

import com.example.model.models.Pokemon;

import java.util.List;

/**
 * @author Konstantin Koval
 * @since 06.04.2020
 */

public interface PokemonDatastore {
    List<Pokemon> getPokemon();

    Pokemon getPokemonById(int id);
}
