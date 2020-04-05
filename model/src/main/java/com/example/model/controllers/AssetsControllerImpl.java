package com.example.model.controllers;

import android.content.Context;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

import javax.inject.Inject;
import javax.inject.Named;

import timber.log.Timber;

/**
 * Created by Konstantin Koval on 05.04.2020
 */
public class AssetsControllerImpl implements AssetsController {

    @Inject
    @Named("Application")
    Context mContext;

    @Inject
    public AssetsControllerImpl() {
    }

    @Override
    public String getContent(String path) {
        StringBuilder builder = new StringBuilder();
        try {
            InputStream inputStream = mContext.getAssets().open(path);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));

            String result;
            while ((result = bufferedReader.readLine()) != null) {
                builder.append(result);
            }

            bufferedReader.close();
        } catch (Exception e) {
            Timber.d("There was an exception %s", e.getLocalizedMessage());
        }
        return builder.toString();
    }
}
