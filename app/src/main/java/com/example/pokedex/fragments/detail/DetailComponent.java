package com.example.pokedex.fragments.detail;

import com.example.pokedex.annotations.PerFragment;
import com.example.pokedex.di.ActivityComponent;

import dagger.Component;

/**
 * Created by Konstantin Koval on 04.04.2020
 */

@Component(modules = {DetailModule.class}, dependencies = {ActivityComponent.class})
@PerFragment
public interface DetailComponent {

    void inject(DetailFragment fragment);

    void inject(DetailPresenterImpl presenter);
}
