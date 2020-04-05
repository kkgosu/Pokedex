package com.example.pokedex.fragments.base;

import com.example.pokedex.di.components.ActivityComponent;

/**
 * Created by Konstantin Koval on 04.04.2020
 */
public abstract class BaseBuilder<T> {
    public abstract T build(ActivityComponent component);
}
