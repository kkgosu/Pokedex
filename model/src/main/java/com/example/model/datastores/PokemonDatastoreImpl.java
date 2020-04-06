package com.example.model.datastores;

import com.example.model.datasources.PokemonLocalDatasource;
import com.example.model.entities.local.PokemonLocalEntity;
import com.example.model.models.Pokemon;
import com.example.model.transformers.PokemonTransformer;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

/**
 * @author Konstantin Koval
 * @since 06.04.2020
 */
public class PokemonDatastoreImpl implements PokemonDatastore {

    @Inject
    PokemonLocalDatasource mLocalDatasource;

    @Inject
    PokemonTransformer mPokemonTransformer;

    private List<Pokemon> mCache;

    @Inject
    public PokemonDatastoreImpl() {
        mCache = new ArrayList<>();
    }

    @Override
    public List<Pokemon> getPokemon() {
        if (mCache != null && !mCache.isEmpty()) {
            return mCache;
        }

        loadPokemonDataIntoCache();

        return mCache;
    }

    @Override
    public Pokemon getPokemonById(int id) {
        if (mCache == null || mCache.isEmpty()) {
            loadPokemonDataIntoCache();
        }
        for (Pokemon pokemon : mCache) {
            if (pokemon.id == id) {
                return pokemon;
            }
        }
        return null;
    }

    private void loadPokemonDataIntoCache() {
        List<PokemonLocalEntity> pokemonLocalEntities = mLocalDatasource.getPokemon();
        for (PokemonLocalEntity pokemonLocalEntity : pokemonLocalEntities) {
            Pokemon pokemon = mPokemonTransformer.toModel(pokemonLocalEntity);
            mCache.add(pokemon);
        }
    }
}
