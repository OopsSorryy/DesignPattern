package org.example.strategy;

import org.example.strategy.Preference;

public class Spicy implements Preference {
    @Override
    public String preference() {
        return "Spicy Food";
    }
}
