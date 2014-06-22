package com.epam.ae.entity;

import java.math.BigDecimal;
import java.util.Random;

public class Waffle extends Candy {

    private double flourContent;

    public Waffle(Shape candyShape,
                  double sugarContent,
                  double weight,
                  BigDecimal price,
                  double flourContent) {
        super(candyShape, sugarContent, weight, price);
        this.flourContent = flourContent;
    }

    public double getFlourContent() {
        return flourContent;
    }

    public void setFlourContent(double flourContent) {
        this.flourContent = flourContent;
    }

    @Override
    public String toString() {
        return "Waffle{" +
                "flourContent=" + flourContent + super.toString();
    }

    public static class Builder {
        Shape candyShape;
        double sugarContent;
        double weight;
        BigDecimal price;
        double flourContent;

        public Builder() {
        }

        public Builder candyShape(Shape val) {
            candyShape = val;
            return this;
        }

        public Builder sugarContent(double val) {
            sugarContent = val;
            return this;
        }

        public Builder weight(double val) {
            weight = val;
            return this;
        }

        public Builder price(BigDecimal val) {
            price = val;
            return this;
        }

        public Builder flourContent(double val) {
            flourContent = val;
            return this;
        }


        public Waffle build() {
            return new Waffle(candyShape, sugarContent, weight, price, flourContent);
        }

    }
}
