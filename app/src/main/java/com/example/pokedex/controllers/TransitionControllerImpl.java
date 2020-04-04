package com.example.pokedex.controllers;

import androidx.fragment.app.Fragment;

import com.example.pokedex.activities.BaseActivity;

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
}
