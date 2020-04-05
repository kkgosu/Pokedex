package com.example.pokedex.fragments.detail;

import com.example.pokedex.controllers.TransitionController;
import com.example.pokedex.fragments.base.BasePresenterImpl;

import javax.inject.Inject;

/**
 * Created by Konstantin Koval on 04.04.2020
 */
public class DetailPresenterImpl extends BasePresenterImpl implements DetailPresenter {

    @Inject
    DetailView mView;

    @Inject
    TransitionController mTransitionController;

    @Override
    public void transistToDashboard() {
        mTransitionController.transitToDashboard();
    }
}
