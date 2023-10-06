package com.restaurant.restaurantcloud.models;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Ingredient {
    private String id;
    private Type type;
    private String name;

    public Ingredient(String id, String name, Type type) {
    }

    public static enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}
