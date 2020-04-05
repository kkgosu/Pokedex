package com.example.pokedex.di.modules;

import android.content.Context;

import com.example.pokedex.activities.BaseActivity;
import com.example.pokedex.annotations.PerActivity;
import com.example.pokedex.controllers.TransitionController;
import com.example.pokedex.controllers.TransitionControllerImpl;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Konstantin Koval on 02.04.2020
 */
@Module
public class ActivityModule {

    private BaseActivity mBaseActivity;

    public ActivityModule(BaseActivity baseActivity) {
        mBaseActivity = baseActivity;
    }

    @Provides
    @PerActivity
    public BaseActivity provideBaseActivity() {
        return mBaseActivity;
    }

    @Provides
    @PerActivity
    @Named("Activity")
    public Context provideActivityContext() {
        return mBaseActivity;
    }

    @Provides
    @PerActivity
    public TransitionController provideTransitionController() {
        return new TransitionControllerImpl(mBaseActivity);
    }
}
