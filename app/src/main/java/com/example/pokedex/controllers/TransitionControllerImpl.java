package com.example.pokedex.controllers;

import androidx.fragment.app.Fragment;

import com.example.pokedex.activities.BaseActivity;
import com.example.pokedex.fragments.dashboard.DashboardBuilder;
import com.example.pokedex.fragments.dashboard.DashboardFragment;
import com.example.pokedex.fragments.detail.DetailBuilder;
import com.example.pokedex.fragments.detail.DetailFragment;

/**
 * Created by Konstantin Koval on 04.04.2020
 */
public class TransitionControllerImpl implements TransitionController {

    private BaseActivity mBaseActivity;

    public TransitionControllerImpl(BaseActivity baseActivity) {
        mBaseActivity = baseActivity;
    }

    @Override
    public void transition(Fragment fragment) {
        mBaseActivity.getSupportFragmentManager()
                .beginTransaction()
                .replace(mBaseActivity.getFragmentLayoutId(), fragment)
                .addToBackStack(fragment.getClass().getSimpleName())
                .commit();
    }

    @Override
    public void transitToDashboard() {
        DashboardFragment fragment = new DashboardBuilder().build(mBaseActivity.getActivityComponent());
        transition(fragment);
    }

    @Override
    public void transitToDetail(int pokemonId) {
        DetailFragment fragment = new DetailBuilder.Builder().setPokemonId(pokemonId).build().build(mBaseActivity.getActivityComponent());
        transition(fragment);
    }
}
