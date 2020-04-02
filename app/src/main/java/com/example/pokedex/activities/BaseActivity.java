package com.example.pokedex.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.pokedex.annotations.Layout;
import com.example.pokedex.annotations.Title;

/**
 * Created by Konstantin Koval on 02.04.2020
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResId());
        setTitle();
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
