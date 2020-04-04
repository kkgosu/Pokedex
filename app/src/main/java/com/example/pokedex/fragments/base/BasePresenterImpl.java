package com.example.pokedex.fragments.base;

import timber.log.Timber;

/**
 * Created by Konstantin Koval on 04.04.2020
 */
public class BasePresenterImpl implements BasePresenter {

    public BasePresenterImpl() {
    }

    @Override
    public void onCreate() {
        Timber.d("Presenter onCreate");
    }

    @Override
    public void onResume() {
        Timber.d("Presenter onResume");

    }

    @Override
    public void onPause() {

        Timber.d("Presenter onPause");
    }
}
