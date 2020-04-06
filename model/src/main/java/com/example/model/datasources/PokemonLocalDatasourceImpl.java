package com.example.model.datasources;

import com.example.model.controllers.AssetsController;
import com.example.model.controllers.GsonController;
import com.example.model.entities.local.PokemonLocalEntity;

import java.util.List;

import javax.inject.Inject;

/**
 * @author Konstantin Koval
 * @since 06.04.2020
 */
public class PokemonLocalDatasourceImpl implements PokemonLocalDatasource {

    @Inject
    GsonController mGsonController;

    @Inject
    AssetsController mAssetsController;

    @Inject
    public PokemonLocalDatasourceImpl() {
    }

    @Override
    public List<PokemonLocalEntity> getPokemon() {
        String json = mAssetsController.getContent("data/pokemon.json");
        List<PokemonLocalEntity> result = mGsonController.listFromJson(json, PokemonLocalEntity[].class);

        return result;
    }
}
