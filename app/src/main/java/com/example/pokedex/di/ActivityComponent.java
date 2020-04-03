package com.example.pokedex.di;

import android.content.Context;

import com.example.pokedex.activities.BaseActivity;
import com.example.pokedex.annotations.PerActivity;

import javax.inject.Named;

import dagger.Component;

/**
 * Created by Konstantin Koval on 02.04.2020
 */

@PerActivity
@Component(modules = {ActivityModule.class}, dependencies = {ApplicationComponent.class})
public interface ActivityComponent {

    BaseActivity baseActivity();

    @Named("Activity")
    Context activityContext();
}
