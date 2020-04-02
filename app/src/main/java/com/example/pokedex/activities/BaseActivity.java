package com.example.pokedex.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.pokedex.annotations.Layout;

/**
 * Created by Konstantin Koval on 02.04.2020
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResId());
    }

    private int getLayoutResId() {
        Layout annotation = getClass().getAnnotation(Layout.class);
        if (annotation == null) {
            throw new IllegalStateException("You have to provide a layout annotation");
        } else {
            return annotation.value();
        }
    }
}
