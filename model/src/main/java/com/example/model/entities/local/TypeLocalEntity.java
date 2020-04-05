package com.example.model.entities.local;

/**
 * Created by Konstantin Koval on 05.04.2020
 */
public class TypeLocalEntity {
    public String slot;
    public NameLocalEntity type;

    @Override
    public String toString() {
        return "TypeLocalEntity{" +
                "slot='" + slot + '\'' +
                ", type=" + type +
                '}';
    }
}
