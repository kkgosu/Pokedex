package com.example.pokedex.util.timber;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import timber.log.Timber;

/**
 * Created by Konstantin Koval on 02.04.2020
 */
public class DebugTree extends Timber.DebugTree {
    @Override
    protected @Nullable String createStackElementTag(@NotNull StackTraceElement element) {
        return super.createStackElementTag(element)
                + " " + element.getFileName()
                + "#" + element.getMethodName()
                + ":" + element.getLineNumber();
    }
}
