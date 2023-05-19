package org.example.strategy;

import org.example.strategy.Preference;

public class GlutenFree implements Preference {

    @Override
    public String preference() {
        return "Gluten-Free Food";
    }
}
