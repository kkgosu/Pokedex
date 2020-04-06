package com.example.model.controllers;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;

/**
 * Created by Konstantin Koval on 05.04.2020
 */
public class GsonControllerImpl implements GsonController {

    @Inject
    Gson mGson;

    @Inject
    public GsonControllerImpl() {
    }

    @Override
    public <T> List<T> listFromJson(String json, Class<T[]> type) {
        T[] array = mGson.fromJson(json, type);
        return new ArrayList<>(Arrays.asList(array));
    }
}
