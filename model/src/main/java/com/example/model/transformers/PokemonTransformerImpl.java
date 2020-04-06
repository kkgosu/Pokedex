package com.example.model.transformers;

import com.example.model.entities.local.PokemonLocalEntity;
import com.example.model.entities.local.StatLocalEntity;
import com.example.model.entities.local.TypeLocalEntity;
import com.example.model.models.Pokemon;
import com.example.model.models.Stat;
import com.example.model.models.Type;

import java.util.ArrayList;

import javax.inject.Inject;

/**
 * @author Konstantin Koval
 * @since 06.04.2020
 */
public class PokemonTransformerImpl implements PokemonTransformer {

    @Inject
    public PokemonTransformerImpl() {
    }

    @Override
    public Pokemon toModel(PokemonLocalEntity entity) {
        if (entity != null) {
            Pokemon model = new Pokemon();
            model.id = entity.id;
            model.name = entity.name;
            model.description = entity.description;
            model.weight = entity.weight;
            model.height = entity.height;
            model.isStarter = entity.isStarter;
            model.baseExperience = entity.baseExperience;

            if (entity.evolutionId != null) {
                model.evolutionId = entity.evolutionId;
            }

            model.types = new ArrayList<>();
            for (TypeLocalEntity type : entity.types) {
                Type type1 = new Type();
                type1.slot = type.slot;
                type1.name = type.type.name;

                model.types.add(type1);
            }

            model.stats = new ArrayList<>();
            for (StatLocalEntity statEntity : entity.stats) {
                Stat stats = new Stat();
                stats.baseStat = statEntity.baseStat;
                stats.name = statEntity.stat.name;

                model.stats.add(stats);
            }
            return model;
        }
        return null;
    }
}
