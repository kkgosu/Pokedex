package com.example.model.entities.local;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Konstantin Koval on 05.04.2020
 */
public class StatLocalEntity {
    @SerializedName("base_stat")
    public String baseStat;
    public NameLocalEntity stat;

    @Override
    public String toString() {
        return "StatLocalEntity{" +
                "baseStat='" + baseStat + '\'' +
                ", stat=" + stat +
                '}';
    }
}
