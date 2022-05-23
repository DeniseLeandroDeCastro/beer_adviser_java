package com.example.beeradviser_java;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {

    List<String> getBrands(String color) {
        List<String> brands = new ArrayList<>();
        if (color.equals("amber")) {
            brands.add("Jack Amber");
            brands.add("Red Moose");
        } else if (color.equals("light")) {
            brands.add("Palisade Peach Light");
            brands.add("Kona Light");
            brands.add("Sam Adams Light");
        } else if (color.equals("brown")) {
            brands.add("Brown Ale Chocolate");
            brands.add("American Brown Ale");
        } else {
            brands.add("Gout Stout");
            brands.add("Dunkel");
        }
        return brands;
    }
}
