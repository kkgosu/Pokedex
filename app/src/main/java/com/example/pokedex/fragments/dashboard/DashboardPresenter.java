package com.example.pokedex.fragments.dashboard;

import com.example.pokedex.fragments.base.BasePresenter;

/**
 * Created by Konstantin Koval on 04.04.2020
 */
public interface DashboardPresenter extends BasePresenter {
    void transitToDetail(int pokemonId);
}
