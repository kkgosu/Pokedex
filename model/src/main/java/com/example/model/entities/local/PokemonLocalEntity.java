package com.example.model.entities.local;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Konstantin Koval on 05.04.2020
 */
public class PokemonLocalEntity {
    public Integer id;
    public String name;
    public Float height;
    public Float weight;
    @SerializedName("base_experience")
    public Integer baseExperience;
    public Integer order;
    @SerializedName("is_default")
    public Boolean isStarter;
    @SerializedName("evolution")
    public Integer evolutionId;
    public List<TypeLocalEntity> types;
    public List<StatLocalEntity> stats;

    @Override
    public String toString() {
        return "PokemonLocalEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", baseExperience=" + baseExperience +
                ", order=" + order +
                ", isStarter=" + isStarter +
                ", evolutionId=" + evolutionId +
                ", types=" + types +
                ", stats=" + stats +
                '}';
    }
}
