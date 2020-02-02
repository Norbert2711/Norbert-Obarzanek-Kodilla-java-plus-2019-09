package com.kodilla.patterns.builder.bigmac;

import com.kodilla.patterns.builder.pizza.Pizza;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Bigmac {

    private final String bun;
    private final int burgers;
    private final String sauce;
    private final List<String> ingredients;

    public Bigmac(String bun, int burgers, String sauce, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bigmac bigmac = (Bigmac) o;
        return burgers == bigmac.burgers &&
                Objects.equals(bun, bigmac.bun) &&
                Objects.equals(sauce, bigmac.sauce) &&
                Objects.equals(ingredients, bigmac.ingredients);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bun, burgers, sauce, ingredients);
    }

    @Override
    public String toString() {
        return "VERY Bigmac " +
                "bun = " + bun  +
                ", burgers = " + burgers +
                ", sauce = " + sauce  +
                ", ingredients = " + ingredients;
    }

    public static class BigmacBuilder{

        private String bun;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder bun(String bun) {
            this.bun = bun;
            return this;
        }

        public BigmacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder sauce (String sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigmacBuilder ingredient(String ingredient) {
            ingredients.add(ingredient);
            return this;
        }

            public Bigmac build(){
            return new Bigmac(bun, burgers, sauce, ingredients);
        }
    }
}
