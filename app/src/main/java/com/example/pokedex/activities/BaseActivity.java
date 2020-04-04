package com.example.pokedex.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.pokedex.PokedexApplication;
import com.example.pokedex.annotations.Layout;
import com.example.pokedex.annotations.Title;
import com.example.pokedex.di.ActivityComponent;
import com.example.pokedex.di.ActivityModule;
import com.example.pokedex.di.DaggerActivityComponent;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by Konstantin Koval on 02.04.2020
 */
public abstract class BaseActivity extends AppCompatActivity {

    protected ActivityComponent mActivityComponent;
    private Unbinder mUnbinder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResId());
        setupDependencyInjection();
        setTitle();

        mUnbinder = ButterKnife.bind(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        mUnbinder.unbind();
    }

    public abstract int getFragmentLayoutId();

    public ActivityComponent getActivityComponent() {
        return mActivityComponent;
    }

    private void setupDependencyInjection() {
        mActivityComponent = DaggerActivityComponent.builder()
                .activityModule(new ActivityModule(this))
                .applicationComponent(((PokedexApplication) getApplication()).getApplicationComponent())
                .build();
    }

    private int getLayoutResId() {
        Layout annotation = getClass().getAnnotation(Layout.class);
        if (annotation == null) {
            throw new IllegalStateException("You have to provide a layout annotation");
        } else {
            return annotation.value();
        }
    }

    private void setTitle() {
        Title annotation = getClass().getAnnotation(Title.class);
        if (annotation != null) {
            if (getSupportActionBar() != null) {
                getSupportActionBar().setTitle(annotation.value());
            } else {
                throw new IllegalStateException("You have to provide action bar");
            }
        }
    }
}
