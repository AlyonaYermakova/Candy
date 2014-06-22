package com.epam.ae.entity;

import java.math.BigDecimal;
import java.util.Random;

public class Chocolate extends Candy {

    private double cocoaContent;
    private ChocolateType chocolateType;

    public Chocolate(Shape candyShape,
                     double sugarContent,
                     double weight,
                     BigDecimal price,
                     double cocoaContent,
                     ChocolateType chocolateType) {
        super(candyShape, sugarContent, weight, price);
        this.cocoaContent = cocoaContent;
        this.chocolateType = chocolateType;
    }

    public static ChocolateType randomChocolateType() {
        int pick = new Random().nextInt(ChocolateType.values().length);
        return ChocolateType.values()[pick];
    }

    public double getCocoaContent() {
        return cocoaContent;
    }

    public void setCocoaContent(double cocoaContent) {
        this.cocoaContent = cocoaContent;
    }

    public ChocolateType getChocolateType() {
        return chocolateType;
    }

    public void setChocolateType(ChocolateType chocolateType) {
        this.chocolateType = chocolateType;
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "cocoaContent=" + cocoaContent +
                ", chocolateType=" + chocolateType + super.toString();
    }

    public enum ChocolateType {
        DARK, MILK, WHITE, DIABETIC;

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
        double cocoaContent;
        ChocolateType chocolateType;

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

        public Builder cocoaContent(double val) {
            cocoaContent = val;
            return this;
        }

        public Builder caramelType(ChocolateType val) {
            chocolateType = val;
            return this;
        }

        public Chocolate build() {
            return new Chocolate(candyShape, sugarContent, weight, price, cocoaContent, chocolateType);
        }

    }
}
