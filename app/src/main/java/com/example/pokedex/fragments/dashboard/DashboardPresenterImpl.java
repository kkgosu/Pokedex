package com.example.pokedex.fragments.dashboard;

import com.example.pokedex.controllers.TransitionController;
import com.example.pokedex.fragments.base.BasePresenterImpl;

import javax.inject.Inject;

/**
 * Created by Konstantin Koval on 04.04.2020
 */
public class DashboardPresenterImpl extends BasePresenterImpl implements DashboardPresenter {

    @Inject
    DashboardView mView;

    @Inject
    TransitionController mTransitionController;

    @Override
    public void transitToDetail() {
        mTransitionController.transitToDetail();
    }
}
