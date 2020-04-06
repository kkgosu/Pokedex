package com.example.model.models;

/**
 * @author Konstantin Koval
 * @since 06.04.2020
 */
public class Type {
    public String slot;
    public String name;

    @Override
    public String toString() {
        return "Type{" +
                "slot='" + slot + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
