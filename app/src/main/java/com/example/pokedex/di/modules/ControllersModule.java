package com.example.pokedex.di.modules;

import com.example.model.controllers.AssetsController;
import com.example.model.controllers.AssetsControllerImpl;
import com.example.model.controllers.GsonController;
import com.example.model.controllers.GsonControllerImpl;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Konstantin Koval on 05.04.2020
 */

@Module
public class ControllersModule {

    @Provides
    @Singleton
    AssetsController provideAssetsController(AssetsControllerImpl assetsControllerImpl) {
        return assetsControllerImpl;
    }

    @Provides
    @Singleton
    GsonController provideGsonController(GsonControllerImpl gsonController) {
        return gsonController;
    }
}

