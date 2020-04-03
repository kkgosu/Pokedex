package com.example.pokedex.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by Konstantin Koval on 02.04.2020
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PerActivity {
}
