package com.example.pokedex.fragments.detail;

import com.example.model.models.Pokemon;
import com.example.pokedex.controllers.TransitionController;
import com.example.pokedex.fragments.base.BasePresenterImpl;
import com.example.pokedex.fragments.detail.interactor.LoadPokemonDataInteractor;

import javax.inject.Inject;

import timber.log.Timber;

/**
 * Created by Konstantin Koval on 04.04.2020
 */
public class DetailPresenterImpl extends BasePresenterImpl implements DetailPresenter {

    @Inject
    DetailView mView;

    @Inject
    TransitionController mTransitionController;

    @Inject
    LoadPokemonDataInteractor mLoadPokemonDataInteractor;

    private int mPokemonId;

    public DetailPresenterImpl(int pokemonId) {
        mPokemonId = pokemonId;
    }

    @Override
    public void onResume() {
        super.onResume();

        Pokemon pokemon = mLoadPokemonDataInteractor.execute(mPokemonId);
        Timber.d("Loaded pokemon: " + pokemon);
    }

    @Override
    public void transistToDashboard() {
        mTransitionController.transitToDashboard();
    }
}
