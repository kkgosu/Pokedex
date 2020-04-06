package com.example.pokedex.fragments.dashboard;

import com.example.pokedex.annotations.PerFragment;
import com.example.pokedex.di.components.ActivityComponent;

import dagger.Component;

/**
 * Created by Konstantin Koval on 04.04.2020
 */

@Component(modules = {DashboardModule.class}, dependencies = {ActivityComponent.class})
@PerFragment
public interface DashboardComponent {

    void inject(DashboardFragment fragment);

    void inject(DashboardPresenterImpl presenter);
}
