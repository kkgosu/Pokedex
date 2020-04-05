package com.example.pokedex.controllers;

import androidx.fragment.app.Fragment;

/**
 * Created by Konstantin Koval on 04.04.2020
 */
public interface TransitionController {
    void transition(Fragment fragment);

    void transitToDashboard();
    void transitToDetail();
}
