package com.example.pokedex.di;

import android.content.Context;

import com.example.pokedex.activities.BaseActivity;
import com.example.pokedex.annotations.PerActivity;

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
}
