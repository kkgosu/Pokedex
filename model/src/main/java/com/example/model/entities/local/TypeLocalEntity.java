package com.example.model.entities.local;

import com.google.gson.Gson;

/**
 * Created by Konstantin Koval on 05.04.2020
 */
public class TypeLocalEntity {
    public String slot;
    public NameLocalEntity type;

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
