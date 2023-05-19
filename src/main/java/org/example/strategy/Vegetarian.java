package org.example.strategy;

import org.example.strategy.Preference;

public class Vegetarian implements Preference {
    @Override
    public String preference() {
        return "Vegetarian Food";
    }
}
