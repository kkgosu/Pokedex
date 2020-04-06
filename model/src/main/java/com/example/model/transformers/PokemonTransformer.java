package com.example.model.transformers;

import com.example.model.entities.local.PokemonLocalEntity;
import com.example.model.models.Pokemon;

/**
 * @author Konstantin Koval
 * @since 06.04.2020
 */
public interface PokemonTransformer {
    Pokemon toModel(PokemonLocalEntity pokemonLocalEntity);
}
