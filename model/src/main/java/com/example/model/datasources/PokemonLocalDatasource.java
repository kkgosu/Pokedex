package com.example.model.datasources;

import com.example.model.entities.local.PokemonLocalEntity;

import java.util.List;

/**
 * @author Konstantin Koval
 * @since 06.04.2020
 */
public interface PokemonLocalDatasource {
    List<PokemonLocalEntity> getPokemon();
}
