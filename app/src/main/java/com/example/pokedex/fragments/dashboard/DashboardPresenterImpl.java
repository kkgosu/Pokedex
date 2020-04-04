package com.example.pokedex.fragments.dashboard;

import com.example.pokedex.di.ActivityComponent;
import com.example.pokedex.fragments.base.BasePresenterImpl;
import com.example.pokedex.fragments.detail.DetailBuilder;
import com.example.pokedex.fragments.detail.DetailFragment;

import javax.inject.Inject;

/**
 * Created by Konstantin Koval on 04.04.2020
 */
public class DashboardPresenterImpl extends BasePresenterImpl implements DashboardPresenter {

    @Inject
    DashboardView mView;

    @Override
    public void transistToDetail(ActivityComponent component) {
        DetailFragment detailFragment = new DetailBuilder().build(component);
        component.transitionController().transition(detailFragment);
    }
}
