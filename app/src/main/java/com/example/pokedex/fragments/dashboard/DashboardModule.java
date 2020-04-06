package com.example.pokedex.fragments.dashboard;

import com.example.pokedex.annotations.PerFragment;
import com.example.pokedex.fragments.dashboard.interactors.LoadPokemonDataInteractor;
import com.example.pokedex.fragments.dashboard.interactors.LoadPokemonDataInteractorImpl;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Konstantin Koval on 04.04.2020
 */
@Module
public class DashboardModule {

    private DashboardView mView;
    private DashboardPresenter mPresenter;

    public DashboardModule(DashboardView view, DashboardPresenter presenter) {
        mView = view;
        mPresenter = presenter;
    }

    @Provides
    @PerFragment
    public DashboardView provideView() {
        return mView;
    }

    @Provides
    @PerFragment
    public DashboardPresenter providePresenter() {
        return mPresenter;
    }

    @Provides
    @PerFragment
    public LoadPokemonDataInteractor provideLoadPokemonDataInteractor(LoadPokemonDataInteractorImpl loadPokemonDataInteractor) {
        return loadPokemonDataInteractor;
    }
}
