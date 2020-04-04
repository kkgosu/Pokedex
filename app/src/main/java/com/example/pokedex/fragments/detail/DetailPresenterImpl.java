package com.example.pokedex.fragments.detail;

import com.example.pokedex.di.ActivityComponent;
import com.example.pokedex.fragments.base.BasePresenterImpl;
import com.example.pokedex.fragments.dashboard.DashboardBuilder;
import com.example.pokedex.fragments.dashboard.DashboardFragment;

import javax.inject.Inject;

/**
 * Created by Konstantin Koval on 04.04.2020
 */
public class DetailPresenterImpl extends BasePresenterImpl implements DetailPresenter {

    @Inject
    DetailView mView;

    @Override
    public void transistToDetail(ActivityComponent activityComponent) {
        DashboardFragment fragment = new DashboardBuilder().build(activityComponent);
        activityComponent.transitionController().transition(fragment);
    }
}
