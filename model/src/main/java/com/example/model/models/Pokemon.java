package com.example.model.models;

import com.google.gson.Gson;

import java.util.List;

/**
 * @author Konstantin Koval
 * @since 06.04.2020
 */
public class Pokemon {
    public int id;
    public String name;
    public String description;
    public float weight;
    public float height;
    public boolean isStarter;
    public int baseExperience;
    public int evolutionId;
    public List<Type> types;
    public List<Stat> stats;

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}
