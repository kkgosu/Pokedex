package com.example.pokedex.util.timber;

import android.util.Log;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Created by Konstantin Koval on 02.04.2020
 */
public class ReleaseTree extends DebugTree {

    @Override
    protected boolean isLoggable(@Nullable String tag, int priority) {
        return priority == Log.ERROR || priority == Log.INFO;
    }

    @Override
    protected void log(int priority, String tag, @NotNull String message, Throwable t) {
        if (isLoggable(tag, priority)) {
            super.log(priority, tag, message, t);
        }
    }
}
