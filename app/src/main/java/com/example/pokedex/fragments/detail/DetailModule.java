package com.example.pokedex.fragments.detail;

import com.example.pokedex.annotations.PerFragment;
import com.example.pokedex.fragments.detail.interactor.LoadPokemonDataInteractor;
import com.example.pokedex.fragments.detail.interactor.LoadPokemonDataInteractorImpl;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Konstantin Koval on 04.04.2020
 */
@Module
public class DetailModule {
    private DetailPresenter mPresenter;
    private DetailView mView;

    public DetailModule(DetailView view, DetailPresenter presenter) {
        mPresenter = presenter;
        mView = view;
    }

    @Provides
    @PerFragment
    public DetailPresenter providePresenter() {
        return mPresenter;
    }

    @Provides
    @PerFragment
    public DetailView provideView() {
        return mView;
    }

    @Provides
    @PerFragment
    public LoadPokemonDataInteractor provideLoadPokemonDataInteractor(LoadPokemonDataInteractorImpl loadPokemonDataInteractor) {
        return loadPokemonDataInteractor;
    }
}
