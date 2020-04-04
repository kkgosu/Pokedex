package com.example.pokedex.fragments.detail;

import com.example.pokedex.di.ActivityComponent;
import com.example.pokedex.fragments.base.BasePresenter;

/**
 * Created by Konstantin Koval on 04.04.2020
 */
public interface DetailPresenter extends BasePresenter {
    void transistToDetail(ActivityComponent activityComponent);
}
