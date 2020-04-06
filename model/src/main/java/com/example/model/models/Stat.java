package com.example.model.models;

import com.google.gson.Gson;

/**
 * @author Konstantin Koval
 * @since 06.04.2020
 */
public class Stat {
    public String baseStat;
    public String name;

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
