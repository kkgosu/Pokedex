package com.example.model.controllers;

import java.util.List;

/**
 * Created by Konstantin Koval on 05.04.2020
 */
public interface GsonController {

    <T> List<T> listFromJson(String json, Class<T[]> type);
}
