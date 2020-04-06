package com.example.pokedex.fragments.dashboard;

import com.example.model.models.Pokemon;
import com.example.pokedex.controllers.TransitionController;
import com.example.pokedex.fragments.base.BasePresenterImpl;
import com.example.pokedex.fragments.dashboard.interactors.LoadPokemonDataInteractor;

import java.util.List;

import javax.inject.Inject;

/**
 * Created by Konstantin Koval on 04.04.2020
 */
public class DashboardPresenterImpl extends BasePresenterImpl implements DashboardPresenter {

    @Inject
    DashboardView mView;

    @Inject
    TransitionController mTransitionController;

    @Inject
    LoadPokemonDataInteractor mLoadPokemonDataInteractor;

    @Override
    public void onResume() {
        super.onResume();

        List<Pokemon> pokemons = mLoadPokemonDataInteractor.execute();
        System.out.println(pokemons);
    }

    @Override
    public void transitToDetail(int pokemonId) {
        mTransitionController.transitToDetail(pokemonId);
    }
}
