package com.epam.ae.entity;

import java.math.BigDecimal;
import java.util.Random;

public class Caramel extends Candy {

    private double fruitContent;
    private CaramelType caramelType;

    public Caramel(Shape candyShape,
                   double sugarContent,
                   double weight,
                   BigDecimal price,
                   double fruitContent,
                   CaramelType caramelType) {
        super(candyShape, sugarContent, weight, price);
        this.fruitContent = fruitContent;
        this.caramelType = caramelType;
    }

    public double getFruitContent() {
        return fruitContent;
    }

    public void setFruitContent(double fruitContent) {
        this.fruitContent = fruitContent;
    }

    public CaramelType getCaramelType() {
        return caramelType;
    }

    public void setCaramelType(CaramelType caramelType) {
        this.caramelType = caramelType;
    }

    public static CaramelType randomCaramelType () {
        int pick = new Random().nextInt(CaramelType.values().length);
        return CaramelType.values()[pick];
    }

    @Override
    public String toString() {
        return "Caramel{" +
                "fruitContent=" + fruitContent +
                ", caramelType=" + caramelType +
                '}' + super.toString();
    }

    public enum CaramelType {
        LOLLIPOP, STUFFED, TOFFEE;

        @Override
        public String toString() {
            return name().toLowerCase();
        }
    }

    public static class Builder {
        Shape candyShape;
        double sugarContent;
        double weight;
        BigDecimal price;
        double fruitContent;
        CaramelType caramelType;

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

        public Builder fruitContent(double val) {
            fruitContent = val;
            return this;
        }

        public Builder caramelType(CaramelType val) {
            caramelType = val;
            return this;
        }

        public Caramel build() {
            return new Caramel(candyShape, sugarContent, weight, price, fruitContent, caramelType);
        }

    }
}
